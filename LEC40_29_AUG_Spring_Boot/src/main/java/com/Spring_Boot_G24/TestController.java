package com.Spring_Boot_G24;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping("/form")
	public void form()
	{
		System.out.println("I am in form Controller");
	}
	
}
