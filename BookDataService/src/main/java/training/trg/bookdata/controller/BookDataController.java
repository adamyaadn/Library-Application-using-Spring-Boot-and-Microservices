package training.trg.bookdata.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import training.trg.bookdata.entity.Author;
import training.trg.bookdata.entity.Book;
import training.trg.bookdata.entity.BookData;
import training.trg.bookdata.entity.Publisher;

@RestController
@RequestMapping(path="bookDetails")
public class BookDataController {
	
	RestTemplate template = new RestTemplate();
	
	@GetMapping(path="{id}")
	public ResponseEntity<?> getBook(@PathVariable("id") int id) {
		try {
			String url3 = "http://localhost:8082/books/{id}";
			Map<String, Integer> urlParams3 = new HashMap<>();
			urlParams3.put("id", id); 
			HttpHeaders headers3 = new HttpHeaders();
			HttpEntity<String> httpEntity3 = new HttpEntity<>(headers3);
			ResponseEntity<Book> responseEntity3 = template.exchange(url3, HttpMethod.GET, httpEntity3, Book.class, urlParams3);
			Book book = responseEntity3.getBody();
			
			int authorId = book.getAuthId();
			String url = "http://localhost:8084/authors/{id}";
			Map<String, Integer> urlParams = new HashMap<>();
			urlParams.put("id", authorId); 
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<String> httpEntity = new HttpEntity<>(headers);
			ResponseEntity<Author> responseEntity = template.exchange(url, HttpMethod.GET, httpEntity, Author.class, urlParams);
			Author author = responseEntity.getBody();
			
			int publisherId = book.getPublisherId();
			String url2 = "http://localhost:8081/publishers/{id}";
			Map<String, Integer> urlParams2 = new HashMap<>();
			urlParams2.put("id", publisherId); 
			HttpHeaders headers2 = new HttpHeaders();
			HttpEntity<String> httpEntity2 = new HttpEntity<>(headers2);
			ResponseEntity<Publisher> responseEntity2 = template.exchange(url2, HttpMethod.GET, httpEntity2, Publisher.class, urlParams2);
			Publisher publisher = responseEntity2.getBody();
			
			BookData bookData = new BookData();
			bookData.setAuthor(author);
			bookData.setPublisher(publisher);
			bookData.setBookId(book.getBookId());
			bookData.setTitle(book.getName());
			bookData.setPrice(book.getPrice());
			
			return ResponseEntity.ok().body(bookData);
		} catch (HttpClientErrorException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getStatusCode());
		}
		
	}
}
