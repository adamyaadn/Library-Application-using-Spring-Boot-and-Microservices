package training.trg.book.service;

import java.util.List;

import training.trg.book.data.Book;

public interface BookService {
	Book getData(int empId);
	List<Book> getAllData();
}
