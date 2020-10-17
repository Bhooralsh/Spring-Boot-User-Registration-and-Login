package com.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Role;
import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.web.dto.UserRegistrationDto;
@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		
		this.userRepository=userRepository;
	}
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),
				registrationDto.getEmail(),registrationDto.getPassword(),Arrays.asList(new Role("Role_User")));
		
		return userRepository.save(user);
	}

	
}
