package com.digitalinnovationone.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {

	private static final long serialVersionUID = 3645710049813545262L;

	public PersonNotFoundException(Long id) {
		super("Person not found with ID " + id);
	}
}
