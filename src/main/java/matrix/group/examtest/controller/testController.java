package matrix.group.examtest.controller;


import matrix.group.examtest.dto.PersonDto;
import matrix.group.examtest.entity.Person;
import matrix.group.examtest.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    ExamService examservice;



    @RequestMapping(value = "add-person" , method = RequestMethod.POST)
    public void createPerson(@RequestBody PersonDto persondto){
        examservice.createPerson(persondto);
    }



}
