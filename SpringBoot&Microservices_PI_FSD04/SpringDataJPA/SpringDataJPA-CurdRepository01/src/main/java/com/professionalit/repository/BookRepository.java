package com.professionalit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.professionalit.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	// select b1_0.book_id,b1_0.book_name,b1_0.book_price from book b1_0 where
	// b1_0.book_price>?
	public List<Book> findByBookPriceGreaterThan(Double price);

	// select b1_0.book_id,b1_0.book_name,b1_0.book_price from book b1_0 where
	// b1_0.book_price<?
	public List<Book> findByBookPriceLessThan(Double price);

	public List<Book> findByBookName(String bookName);

	@Query(value = "select * from book", nativeQuery = true) // database dependent
	public List<Book> getAllBook();

	@Query(value = " from Book b", nativeQuery = false) // database independent
	public List<String> getAllBookHQL();

}
