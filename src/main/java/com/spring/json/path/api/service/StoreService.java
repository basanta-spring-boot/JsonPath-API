package com.spring.json.path.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.spring.json.path.api.dao.StoreDAO;
import com.spring.json.path.api.dto.Book;
import com.spring.json.path.api.dto.StoreResponse;

@Service
public class StoreService {
	@Autowired
	private StoreDAO dao;

	public StoreResponse getResponse() {
		return dao.getDummyResponse();
	}

	@SuppressWarnings("unchecked")
	public List<Book> getBooks() throws JsonProcessingException {
		String jsonPathExpression = "$.store.book[*]";
		String response = new ObjectMapper().writeValueAsString(dao
				.getDummyResponse());
		List<Book> books = JsonPath.parse(response).read(jsonPathExpression,
				List.class);
		return books;
	}
}
