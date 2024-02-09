package training.trg.publisher.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.trg.publisher.data.*;
import training.trg.publisher.exceptions.NonExistentDataAccess;
import training.trg.publisher.service.PublisherService;

@RestController
@RequestMapping(path="publishers")
public class PublisherController {
	
	@Autowired
	PublisherService service;
	
	@GetMapping(path = "{publisherId}")
	public ResponseEntity<Object> getEmployee(@PathVariable("publisherId") int publisherId) {
	    try {
	        Publisher e = service.getData(publisherId);
	        return ResponseEntity.ok().body(e);
	    } catch (NonExistentDataAccess ex) {
	        ResponseMessageCustom resp = new ResponseMessageCustom("Publisher not found.", LocalDateTime.now());
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
	    }
	}
	
	@GetMapping(path="all")
	public List<Publisher> getEmployeeList() {
		List<Publisher> e = service.getAllData();
		return e;
	}
}
