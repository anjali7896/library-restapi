package com.example.library.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.library.model.Book;
import com.example.library.service.BookService;




@RestController
@RequestMapping("/books")
public class BookController {
	private final BookService service;
	
	public BookController(BookService service) {
		this.service=service;
	}
	
	
	//post or add the book
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	
	//get books by id
	@GetMapping("/{id}")
	public Book getBook(@PathVariable int id) {
		return service.getBookById(id);
	}
	
	//get book by year
	@GetMapping("/search")
	public List<Book> searchByYear(@RequestParam int year){
		return service.getBooksByYear(year);
	}
	
	
	
	//get all books
	@GetMapping
	public List<Book>getAllBooks(){
		return service.getAllBooks();
		
	}
	
	
	//delete book by id
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id) {
		service.deleteBook(id);
		return "Book delete successfully";
	}
	
	
	
	
	

}
