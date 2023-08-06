package com.lumen.service;

import java.util.List;
import java.util.Set;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public interface IBookService {
	void addBook(Book book);
	List<Book> getAll();
	Set<Book> getByAuthorContains(String author) throws BookNotFoundException;
	Set<Book> getByCategory(String category) throws BookNotFoundException;
	Set<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	Set<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	Set<Book> getId(int bookId) throws BookNotFoundException;
	
}
