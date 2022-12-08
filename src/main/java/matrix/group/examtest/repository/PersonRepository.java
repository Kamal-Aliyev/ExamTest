package matrix.group.examtest.repository;

import matrix.group.examtest.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person , Long > {

}
