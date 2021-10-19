package com.digitalinnovationone.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalinnovationone.personapi.dto.MessageResponseDTO;
import com.digitalinnovationone.personapi.entity.Person;
import com.digitalinnovationone.personapi.repository.PersonRepository;

@Service
public class PersonService {

private PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO createPerson(Person person) {
		Person savePerson = personRepository.save(person);
		return MessageResponseDTO.builder().message("Created Person with ID: " + savePerson.getId()).build();
	}
	
}
