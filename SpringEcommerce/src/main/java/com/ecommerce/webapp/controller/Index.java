package com.ecommerce.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name="/")
public class Index {

	@RequestMapping(name="/")
	public String getIndex() {
		return "index";
	}
	
}
