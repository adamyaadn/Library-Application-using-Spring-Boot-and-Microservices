package training.trg.author.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import training.trg.author.data.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{
	
}
