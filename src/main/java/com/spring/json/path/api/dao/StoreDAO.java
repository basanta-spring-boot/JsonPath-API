package com.spring.json.path.api.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.spring.json.path.api.dto.Bicycle;
import com.spring.json.path.api.dto.Book;
import com.spring.json.path.api.dto.Store;
import com.spring.json.path.api.dto.StoreResponse;

@Repository
public class StoreDAO {

	public StoreResponse getDummyResponse() {
		StoreResponse storeResponse = new StoreResponse();
		Book book = null;
		List<Book> books = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			book = new Book();
			book.setAuthor("author" + i);
			book.setCategory("category" + i);
			book.setIsbn("isbn" + i);
			book.setPrice(new Random().nextDouble() * i);
			book.setTitle("title" + i);
			books.add(book);
		}
		Bicycle bicycle = new Bicycle("red", 1536513);
		Store store = new Store();
		store.setBicycle(bicycle);
		store.setBook(books);
		storeResponse.setStore(store);
		return storeResponse;
	}
}
