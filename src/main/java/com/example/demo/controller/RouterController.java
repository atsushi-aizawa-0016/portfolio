package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class RouterController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
