package com.java.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this notation is very important for url mapping 
//this controller has some methods
public class HelloController {

	@RequestMapping("/hello")//takes the parameter in which url it is used to 
	public String sayHi()
	{
		return "HI";
	}
	
	
}
