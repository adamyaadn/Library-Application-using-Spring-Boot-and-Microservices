package training.trg.publisher.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import training.trg.publisher.data.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Integer>{
	
}
