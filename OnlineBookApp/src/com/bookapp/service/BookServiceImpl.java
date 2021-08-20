package com.bookapp.service;

import java.util.*;


import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {

	@Override
        public Book getBookById(int bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
		//List <Book> booklist=showBooks();
		boolean isPresent=false;
		
		for(Book book:showBooks()) {
			if(book.getBookId()==bookid) {
			  isPresent= true;
			  return book;
			}
			
		}
		if(isPresent==false) {
			throw new BookNotFoundException("Invalid Id");
			
		}
		return null;
		
		
		
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List <Book> booklist=showBooks();
		List <Book> booksByAuthor=new ArrayList<>();
		boolean isPresent=false;
		for(Book book:booklist) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				booksByAuthor.add(book);
				isPresent=true;
				
			}
		}
		if(!isPresent) {
			throw new BookNotFoundException("Invalid book author");
		}
		
		return booksByAuthor;
	}

	@Override
	public List<Book> getBookByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List <Book> booklist=showBooks();
		List <Book> booksByCategory=new ArrayList<>();
		boolean isPresent=false;
		for(Book book:booklist) {
			if(book.getCategory().equals(category)) {
				booksByCategory.add(book);
				isPresent=true;
				
			}
		}
		if(!isPresent) {
			throw new BookNotFoundException("Invalid category ");
		}
		
		return booksByCategory;
		
		
	}

	@Override
	public List<Book> getBookByTitle(String title) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List <Book> booklist=showBooks();
		List <Book> booksByTitle=new ArrayList<>();
		boolean isPresent=false;
		for(Book book:booklist) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				booksByTitle.add(book);
				isPresent=true;
				
			}
		}
		if(!isPresent) {
			throw new BookNotFoundException("Invalid title  ");
		}
		
		return booksByTitle;
	}
	@Override
	public List<Book> getBookByLessPrice(Double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List <Book> booklist=showBooks();
		List <Book> Lessprice=new ArrayList<>();
		boolean isPresent=false;
		for(Book book:booklist) {
			if(book.getPrice()<=price) {
				isPresent=true;
				Lessprice.add(book);
			
			}
		}
		if(!isPresent) {
		throw new BookNotFoundException("Invalid price");
	}
		return Lessprice;
	}

	@Override
	public List<Book> getall() {
		// TODO Auto-generated method stub
		return showBooks();
	}
	private List<Book> showBooks(){
		return Arrays.asList
(			new Book("Java in Action","Suman","Sci-Fic",50000,1),
			new Book("Grudge","Navin","Horror",60000,2),
			new Book("Winter Soldier","prasana","Thriller",70000,3),
			new Book("Thor","Suman","Sci-Fic",80000,4),
			new Book("End Game","Avinash","Sci-Fic",90000,5),
			new Book("Avengers","Teja","Sci-Fic",100000,6)
		);

}

	
	
}
