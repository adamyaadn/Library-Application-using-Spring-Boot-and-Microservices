package training.trg.publisher;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import training.trg.publisher.data.Publisher;
import training.trg.publisher.repository.PublisherRepository;

@Component
public class DatabaseInit implements CommandLineRunner{

	@Autowired
	PublisherRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Publisher(2993,"Bloomsbury Publications","California,US"));
		repo.save(new Publisher(7394,"Orlando Publications","Ontario,Canada"));
		repo.save(new Publisher(9928,"Silver Publications","Washington,US"));
		
		System.out.println("3 rows inserted.");
		
	}

}
