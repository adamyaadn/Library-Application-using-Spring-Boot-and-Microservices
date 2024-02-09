package training.trg.author.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.trg.author.data.Author;
import training.trg.author.repository.AuthorRepository;
import training.trg.author.exceptions.DuplicateDataException;
import training.trg.author.exceptions.NonExistentDataAccess;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository repo;

	@Override
	public Author getData(int empId) {
		if(repo.existsById(empId)) {
			return repo.getOne(empId);
		}else {
			throw new NonExistentDataAccess();
		}
	}

	@Override
	public List<Author> getAllData() {
		List<Author> list = repo.findAll();
		return list;
	}

}
