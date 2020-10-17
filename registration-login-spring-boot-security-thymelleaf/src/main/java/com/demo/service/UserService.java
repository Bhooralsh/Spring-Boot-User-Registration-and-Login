package com.demo.service;

import com.demo.model.User;
import com.demo.web.dto.UserRegistrationDto;

public interface UserService {
 
	User save(UserRegistrationDto registrationDto);
	
	
}
