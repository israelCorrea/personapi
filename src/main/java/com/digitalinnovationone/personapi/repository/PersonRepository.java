package com.digitalinnovationone.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalinnovationone.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
