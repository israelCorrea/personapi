package com.digitalinnovationone.personapi.utils;

import com.digitalinnovationone.personapi.dto.request.PhoneDTO;
import com.digitalinnovationone.personapi.entity.Phone;
import com.digitalinnovationone.personapi.enums.PhoneType;

public class PhoneUtils {

	private static final Long PHONE_ID = 1L;
	private static final String NUMBER = "(31)99685-4578";
	
	public static PhoneDTO createFakeDTO() {
		return PhoneDTO.builder().
				number(NUMBER).
				type(PhoneType.MOBILE).build();
	}
	
	public static Phone createFakeEntity() {
		return Phone.builder().
				id(PHONE_ID).
				number(NUMBER).
				type(PhoneType.MOBILE).build();
	}
	
}
