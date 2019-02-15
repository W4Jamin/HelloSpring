package helloSpring.by9ye.helloWebApp.repositories;

import helloSpring.by9ye.helloWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
