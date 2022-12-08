package matrix.group.examtest.service;

import lombok.Builder;
import matrix.group.examtest.dto.PersonDto;
import matrix.group.examtest.entity.Person;
import matrix.group.examtest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class ExamService {

    @Autowired
    PersonRepository repository;

    public void createPerson(@RequestBody PersonDto persondto){
        Person person = new Person().builder()
        .id(persondto.getId())
                .name(persondto.getName())
                .surname(persondto.getSurname())
                .build();

        repository.save(person);

    }

}
