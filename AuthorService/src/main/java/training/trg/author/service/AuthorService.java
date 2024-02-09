package training.trg.author.service;

import java.util.List;

import training.trg.author.data.Author;

public interface AuthorService {
	Author getData(int empId);
	List<Author> getAllData();
}
