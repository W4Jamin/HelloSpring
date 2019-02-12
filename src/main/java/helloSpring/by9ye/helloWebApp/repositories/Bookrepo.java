package helloSpring.by9ye.helloWebApp.repositories;

import helloSpring.by9ye.helloWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface Bookrepo extends CrudRepository<Book, Long> {
}
