package training.trg.author.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.trg.author.service.AuthorService;
import training.trg.author.data.*;
import training.trg.author.data.ResponseMessageCustom;
import training.trg.author.exceptions.NonExistentDataAccess;

@RestController
@RequestMapping(path="authors")
public class AuthorController {
	
	@Autowired
	AuthorService service;
	
	@GetMapping(path = "{authId}")
	public ResponseEntity<Object> getEmployee(@PathVariable("authId") int authId) {
	    try {
	        Author e = service.getData(authId);
	        return ResponseEntity.ok().body(e);
	    } catch (NonExistentDataAccess ex) {
	        ResponseMessageCustom resp = new ResponseMessageCustom("Employee not found.", LocalDateTime.now());
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
	    }
	}
	
	@GetMapping(path="all")
	public List<Author> getEmployeeList() {
		List<Author> e = service.getAllData();
		return e;
	}
}
