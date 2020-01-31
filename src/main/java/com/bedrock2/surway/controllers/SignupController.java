package com.bedrock2.surway.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String loadLogin() {
		return "/views/loginSignup.jsp";
	}
}
