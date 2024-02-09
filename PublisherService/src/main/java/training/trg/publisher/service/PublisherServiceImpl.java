package training.trg.publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.trg.publisher.data.Publisher;
import training.trg.publisher.exceptions.DuplicateDataException;
import training.trg.publisher.exceptions.NonExistentDataAccess;
import training.trg.publisher.repository.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService {

	@Autowired
	PublisherRepository repo;

	@Override
	public Publisher getData(int empId) {
		if(repo.existsById(empId)) {
			return repo.getOne(empId);
		}else {
			throw new NonExistentDataAccess();
		}
	}

	@Override
	public List<Publisher> getAllData() {
		List<Publisher> list = repo.findAll();
		return list;
	}

}
