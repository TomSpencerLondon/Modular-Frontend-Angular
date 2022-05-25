package com.modular.repositories;

import com.modular.entities.Person;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryAdapter implements PersonRepository {
  PersonJpaRepository personJpaRepository;

  public PersonRepositoryAdapter(PersonJpaRepository personJpaRepository) {
    this.personJpaRepository = personJpaRepository;
  }

  @Override
  public Person save(Person person) {
    return personJpaRepository.save(person);
  }

  @Override
  public List<Person> findAll() {
    return personJpaRepository.findAll();
  }
}
