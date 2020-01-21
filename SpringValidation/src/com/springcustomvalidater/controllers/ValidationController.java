package com.springcustomvalidater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidationController {
	@RequestMapping("/validation")
	public String validation()
	{
		return "home";
	}
}
