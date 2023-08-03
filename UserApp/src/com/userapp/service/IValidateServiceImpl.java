package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class IValidateServiceImpl implements IValidationService {

	String[] usernames = { "Viswa", "Nikki", "Karthi","lucky" };

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		for (String name : usernames) {
			if (name.equals(username)) {
				throw new NameExistsException("Exception in username");
			}
		}
		return true;

	}

	@Override
	public boolean validatePassword(String username) throws TooLongException, TooShortException {
		if (username.length() < 4) {
			throw new TooShortException("Passwaord too short");
		}
		if (username.length() > 10) {
			throw new TooLongException("Password too long");
		}
		return true;
	}

}
