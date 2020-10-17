package com.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.UserService;
import com.demo.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;
	
	@Autowired
	public UserRegistrationController(UserService userService) {
		
		this.userService = userService;
	}
	
	
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
		
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
}
