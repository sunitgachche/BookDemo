package com.Demo.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.books.model.Books;
import com.Demo.books.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@PostMapping("/books")
	
	private int saveBook(@RequestBody Books books)
	{
		
		booksService.saveOrUpdate(books);
		return books.getBookid();
		
		
	}
	

}
