package com.laptrinhjavaweb.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.IUserService;

@RestController
public class AuthenController {
	@Autowired
	private IUserService userService;
	
	@GetMapping("/register")
	public ModelAndView ShowRegister() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	@PostMapping("/authen")
	public void Register(@RequestBody UserDTO user) {
		userService.save(user);
	}
}
