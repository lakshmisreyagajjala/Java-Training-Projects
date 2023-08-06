package com.lumen.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService {


	@Override
	public void addBook(Book book) {
		BookDetails.addBooks(book);
	}

	@Override
	public List<Book> getAll() {
		new BookDetails();
		List<Book> books = BookDetails.showBooks();
		return books;
	}


	@Override
	public Set<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksByAuthor = new HashSet<Book>();
		Iterator<Book> booksByAuthorIterator = books.stream().iterator();

		try {
			while(booksByAuthorIterator.hasNext()) {
				Book book = booksByAuthorIterator.next();
				if(book.getAuthor().equals(author)) {
					booksByAuthor.add(book);
				}
			} 

			if(booksByAuthor.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Author not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByAuthor;
	}


	@Override
	public Set<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksByCategory = new HashSet();
		Iterator<Book> booksByCategoryIterator = books.stream().iterator();
		try {
			while(booksByCategoryIterator.hasNext()) {
				Book book = booksByCategoryIterator.next();
				if(book.getCategory().equals(category)) {
					booksByCategory.add(book);
				}
			} 
			
			if(booksByCategory.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Category not found!");
			}

		} catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByCategory;



	}

	@Override
	public Set<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksByPriceLessThan = new HashSet();
		Iterator<Book> booksByPriceLessThanIterator = books.stream().iterator();
		try {
			while(booksByPriceLessThanIterator.hasNext()) {
				Book book = booksByPriceLessThanIterator.next();
				if(book.getPrice() <= price) {
					booksByPriceLessThan.add(book);
				}
			} 

			if(booksByPriceLessThan.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Price less than "+ price + " not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByPriceLessThan;
	}


	@Override
	public Set<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksByAuthorContainsAndCategory = new HashSet();
		Iterator<Book> booksByAuthorContainsAndCategoryIterator = books.stream().iterator();
		try {
			while(booksByAuthorContainsAndCategoryIterator.hasNext()) {
				Book book = booksByAuthorContainsAndCategoryIterator.next();
				if(book.getAuthor().equals(author) | book.getCategory().equals(category)) {
					booksByAuthorContainsAndCategory.add(book);
				}
			} 
			
			if(booksByAuthorContainsAndCategory.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book with provided Author and Category not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByAuthorContainsAndCategory;
	}


	@Override
	public Set<Book> getId(int bookId) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksById = new HashSet();
		Iterator<Book> booksByIdIterator = books.stream().iterator();
		try {
			while(booksByIdIterator.hasNext()) {
				Book book = booksByIdIterator.next();
				if(book.getBookId() == bookId) {
					booksById.add(book);
				}
			} 
			
			if(booksById.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book ID not found!");
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksById;
	}
}
