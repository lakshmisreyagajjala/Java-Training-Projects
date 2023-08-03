package com.userapp.client;

import com.userapp.service.IValidateServiceImpl;

public class IvalidateMain {

	public static void main(String[] args) {
		
		IValidateServiceImpl validate = new IValidateServiceImpl();
		
		try {
			validate.validateUsername("lucky");
			validate.validatePassword("hars");
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

