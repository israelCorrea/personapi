package com.digitalinnovationone.personapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovationone.personapi.dto.MessageResponseDTO;
import com.digitalinnovationone.personapi.entity.Person;
import com.digitalinnovationone.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
}
