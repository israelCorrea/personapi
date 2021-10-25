package com.digitalinnovationone.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import com.digitalinnovationone.personapi.dto.request.PersonDTO;
import com.digitalinnovationone.personapi.entity.Person;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class PersonUtils {

	private static final Long PERSON_ID = 1L;
	private static final String FIRST_NAME = "João";
	private static final String LAST_NAME = "Silva";
	private static final String CPF_NUMBER = "123.456.789-11";
	private static final LocalDate BIRTH_DATE = LocalDate.of(2000, 3, 28);
	
	public static PersonDTO createFakeDTO() {
		return PersonDTO.builder().
				firstName(FIRST_NAME).
				lastName(LAST_NAME).
				cpf(CPF_NUMBER).
				birthDate("04-04-2010").
				phones(Collections.singletonList(PhoneUtils.createFakeDTO())).
				build();
	}
	
	public static Person createFakeEntity() {
		return Person.builder().
				id(PERSON_ID).
				firstName(FIRST_NAME).
				lastName(LAST_NAME).
				cpf(CPF_NUMBER).
				birthDate(BIRTH_DATE).
				phones(Collections.singletonList(PhoneUtils.createFakeEntity())).
				build();
	}
	
	public static String asJsonString(PersonDTO personDTO) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(personDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
}
