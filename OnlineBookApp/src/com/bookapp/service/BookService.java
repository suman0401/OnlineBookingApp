package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.*;

public interface BookService {
	Book getBookById(int bookid)throws BookNotFoundException;
	List<Book> getBookByAuthor(String author) throws BookNotFoundException;
	List<Book> getBookByCategory(String category) throws BookNotFoundException;
	List<Book> getBookByTitle(String author) throws BookNotFoundException;
	List<Book> getall() throws BookNotFoundException;
	List<Book> getBookByLessPrice(Double price) throws BookNotFoundException;
	


}
