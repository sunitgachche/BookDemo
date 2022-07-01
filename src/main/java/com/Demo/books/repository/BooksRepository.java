package com.Demo.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.books.model.Books;

public interface BooksRepository extends JpaRepository<Books,Integer> {

}
