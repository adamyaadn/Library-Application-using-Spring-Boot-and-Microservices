package training.trg.author;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import training.trg.author.data.Author;
import training.trg.author.repository.AuthorRepository;

@Component
public class DatabaseInit implements CommandLineRunner{

	@Autowired
	AuthorRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Author(1,"Jane Austen","Period Drama",993789294));
		repo.save(new Author(2,"Agatha Christie","Thriller",999889294));
		repo.save(new Author(3,"Paulo Coelho","Philosophy",883789294));
		
		System.out.println("3 rows inserted.");
		
	}

}
