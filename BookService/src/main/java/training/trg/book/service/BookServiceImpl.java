package training.trg.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.trg.book.data.Book;
import training.trg.book.exceptions.DuplicateDataException;
import training.trg.book.exceptions.NonExistentDataAccess;
import training.trg.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repo;

	@Override
	public Book getData(int empId) {
		if(repo.existsById(empId)) {
			return repo.getOne(empId);
		}else {
			throw new NonExistentDataAccess();
		}
	}

	@Override
	public List<Book> getAllData() {
		List<Book> list = repo.findAll();
		return list;
	}

}
