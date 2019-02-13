package helloSpring.by9ye.helloWebApp.repositories;

import helloSpring.by9ye.helloWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

// use repo to realize CRUD. Let application level to operate on data using object base programming
public interface AuthorRepo extends CrudRepository<Author, Long> {
}
