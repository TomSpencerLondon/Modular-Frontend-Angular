package com.modular.repositories;

import com.modular.entities.Person;
import java.util.List;

public interface PersonRepository {
  Person save(Person person);
  List<Person> findAll();
}
