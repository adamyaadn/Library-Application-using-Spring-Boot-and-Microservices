package training.trg.book.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.trg.book.data.Book;
import training.trg.book.data.ResponseMessageCustom;
import training.trg.book.exceptions.NonExistentDataAccess;
import training.trg.book.service.BookService;

@RestController
@RequestMapping(path="books")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping(path = "{bookId}")
	public ResponseEntity<Object> getEmployee(@PathVariable("bookId") int bookId) {
	    try {
	        Book e = service.getData(bookId);
	        return ResponseEntity.ok().body(e);
	    } catch (NonExistentDataAccess ex) {
	        ResponseMessageCustom resp = new ResponseMessageCustom("Employee not found.", LocalDateTime.now());
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
	    }
	}
	
	@GetMapping(path="all")
	public List<Book> getEmployeeList() {
		List<Book> e = service.getAllData();
		return e;
	}
}
