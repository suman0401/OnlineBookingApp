package com.bookapp.client;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class MainUser {

	public static void main(String[] args) throws BookNotFoundException {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl();
		
		while (true) {
			System.out.println("Enter your choice \n 1.Author name 2.Category 3.Title 4.BookId 5.price 6.get all book 7.exit");
			Scanner sc = new Scanner(System.in);
			int check = sc.nextInt();
			// System.out.println(allbook);
			
			switch (check) {
			case 1:
				try {
					System.out.println("Enter author name");
					String author = sc.next();
					List<Book> authors = bookService.getBookByAuthor(author);
					for (Book book : authors) {
						System.out.println(book);
					}
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Enter category ");
					String category = sc.next();
					List<Book> catg = bookService.getBookByCategory(category);
					for (Book book : catg) {
						System.out.println(book);
					}
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Enter title");
					String title = sc.next();
					List<Book> titles = bookService.getBookByTitle(title);
					for (Book book : titles) {
						System.out.println(book);
					}
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Enter BookId");
					int id = sc.nextInt();
					System.out.println(bookService.getBookById(id));
					
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Enter price");
					Double price = sc.nextDouble();
					List<Book> lessprice = bookService.getBookByLessPrice(price);
					for (Book book : lessprice) {
						System.out.println(book);

					}

				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block

					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					List<Book> allbook = bookService.getall();
					for (Book book : allbook) {
						System.out.println(book);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("Exiting");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Input");
				sc.close();

			}

		}

	}
}
