package training.trg.publisher.service;

import java.util.List;

import training.trg.publisher.data.Publisher;

public interface PublisherService {
	Publisher getData(int empId);
	List<Publisher> getAllData();
}
