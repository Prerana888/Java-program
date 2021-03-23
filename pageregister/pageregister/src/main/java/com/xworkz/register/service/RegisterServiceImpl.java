package com.xworkz.register.service;

import com.xworkz.registercheck.dao.RegisterDAO;
import com.xworkz.registercheck.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {
	private RegisterDAO registerDAO;

	public RegisterServiceImpl(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}

	@Override
	public void validateAndSaveUserDetails(RegisterDTO registerDTO) {
		boolean validData = false;
		if (registerDTO != null) {
			System.out.println("dto is not null, will validate fields");
			String firstname = registerDTO.getFname();
			if (firstname != null && firstname.length() >= 2 && !firstname.isEmpty() && !firstname.contains(" ")) {
				System.out.println("firstname is valid");
				validData = true;
			} else {
				System.out.println("firstname is invalid");
				validData = false;
			}

			if (validData) {
				String lastname = registerDTO.getLname();
				if (lastname != null && lastname.length() >= 1 && !lastname.isEmpty() && !lastname.contains(" ")) {
					System.out.println("lastname is valid");
					validData = true;
				} else {
					System.out.println("lastname is invalid");
					validData = false;
				}
			}
			if (validData) {
				String email = registerDTO.getEmail();
				if (email != null && email.length() >= 2 && !email.isEmpty() && !email.contains(" ")) {
					System.out.println("email is valid");
					validData = true;
				} else {
					System.out.println("email is invalid");
					validData = false;
				}
			}

			if (validData) {
				String address = registerDTO.getAddress();
				if (address != null && address.length() >= 2 && !address.isEmpty() && !address.contains(" ")) {
					System.out.println("address is valid");
					validData = true;
				} else {
					System.out.println("address is invalid");
					validData = false;
				}
			}
			if (validData) {
				String password = registerDTO.getPassword();
				if (password != null && password.length() >= 2 && !password.isEmpty() && !password.contains(" ")) {
					System.out.println("password is valid");
					validData = true;
				} else {
					System.out.println("password is invalid");
					validData = false;
				}
			}
		}
		if (validData) {
			System.out.println("data is valid ");
			registerDAO.saveUserDetails(registerDTO);
		} else {
			System.out.println(" invalid data");
		}

	}

}
