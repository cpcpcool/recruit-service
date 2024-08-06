package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping(value = { "", "/page2", "/page3", "/result" })
	public String forward() {
		return "forward:/";
	}

}