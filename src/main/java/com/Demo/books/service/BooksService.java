package com.Demo.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.books.model.Books;
import com.Demo.books.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;

	public void saveOrUpdate(Books books) {
		
booksRepository.save(books);		
		
	}

}
