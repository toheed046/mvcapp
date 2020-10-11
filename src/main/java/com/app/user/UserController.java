package com.app.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value="home", method=RequestMethod.GET)
	public String home() {
		return "Home Page";
	}
	
}
