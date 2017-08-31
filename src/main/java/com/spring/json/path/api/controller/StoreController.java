package com.spring.json.path.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spring.json.path.api.dto.Book;
import com.spring.json.path.api.dto.StoreResponse;
import com.spring.json.path.api.service.StoreService;

@RestController
public class StoreController {
	@Autowired
	private StoreService service;

	@RequestMapping(value = "/getJsonPathData")
	public StoreResponse getStoreResponse() {
		return service.getResponse();

	}

	@RequestMapping(value = "/getBooks")
	public List<Book> getBooks() throws JsonProcessingException {
		return service.getBooks();
	}
}
