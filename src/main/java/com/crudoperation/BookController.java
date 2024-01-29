package com.crudoperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable Integer id) {
		return bookService.getBookById(id);
	}

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
}
