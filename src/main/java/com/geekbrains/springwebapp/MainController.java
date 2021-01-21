package com.geekbrains.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/city")
	public String homepage()
	{
		return "s";
	}
}
