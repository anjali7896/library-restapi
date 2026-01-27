package com.example.library.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.library.model.Book;



@Service
public class BookService {
   private final Map<Integer,Book>books=new HashMap<>();
   
   //we have to add the book 
   public Book addBook(Book book) {
	   books.put(book.getId(), book);
	   return book;
   }
   
   //book get by id
   public Book getBookById(int id) {
	   return books.get(id);
   }
   
   
   //get books by year
   public List<Book>getBooksByYear(int year){
	   return books.values()
		  .stream().filter(book->book.getYear()==year).collect(Collectors.toList());
   }
   
   
   //we have to get all books
   public List<Book>getAllBooks(){
	   return new ArrayList<>(books.values());
	   
   }
   
   
   //we have to delete the book
   public void deleteBook(int id) {
	   books.remove(id);
   }
   
}
