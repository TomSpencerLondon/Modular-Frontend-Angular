package com.modular.controllers;
import com.modular.entities.Person;
import com.modular.repositories.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

  private final PersonRepository personRepository;

  @Autowired
  public PersonController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @GetMapping("/api/users")
  public List<Person> getUsers() {
    return personRepository.findAll();
  }

  @PostMapping("/api/users")
  void addUser(@RequestBody Person person) {
    personRepository.save(person);
  }
}
