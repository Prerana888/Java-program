
package com.xworkz.register.service;

import com.xworkz.registercheck.dto.RegisterDTO;

public interface RegisterService {

	void validateAndSaveUserDetails(RegisterDTO registerDTO);
}