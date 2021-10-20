package com.digitalinnovationone.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalinnovationone.personapi.dto.request.PersonDTO;
import com.digitalinnovationone.personapi.dto.response.MessageResponseDTO;
import com.digitalinnovationone.personapi.entity.Person;
import com.digitalinnovationone.personapi.mapper.PersonMapper;
import com.digitalinnovationone.personapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;
	
	private PersonMapper personMapper;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
		this.personMapper = PersonMapper.INSTANCE;
	}
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		Person personToSave = personMapper.toModel(personDTO);
		Person savePerson = personRepository.save(personToSave);
		return MessageResponseDTO.builder().message("Created Person with ID: " + savePerson.getId()).build();
	}
	
}
