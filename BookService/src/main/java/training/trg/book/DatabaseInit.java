package training.trg.book;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import training.trg.book.data.Book;
import training.trg.book.repository.BookRepository;

@Component
public class DatabaseInit implements CommandLineRunner{

	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Book(126,2993,1,"Pride and Prejudice",250));
		
		System.out.println("3 rows inserted.");
		
	}

}
