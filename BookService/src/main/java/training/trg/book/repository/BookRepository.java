package training.trg.book.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import training.trg.book.data.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	
}
