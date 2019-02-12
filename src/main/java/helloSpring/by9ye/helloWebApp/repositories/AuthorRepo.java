package helloSpring.by9ye.helloWebApp.repositories;

import helloSpring.by9ye.helloWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
