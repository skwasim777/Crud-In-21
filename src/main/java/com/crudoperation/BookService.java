package com.crudoperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService  {
	@Autowired
	private BookRespository bookRespository;

	public List<Book> getAllBooks() {
		return bookRespository.findAll();
	}

	public Optional<Book> getBookById(Integer id) {
		return bookRespository.findById(id);
	}

	public Book saveBook(Book book) {
		return bookRespository.save(book);
	}

	public void deleteBook(Integer id) {
		bookRespository.deleteById(id);
	}
}
