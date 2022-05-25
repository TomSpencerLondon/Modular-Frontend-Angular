package com.modular.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private final String name;
  private final String email;

  public Person() {
    this.name = "";
    this.email = "";
  }

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
  }
}
