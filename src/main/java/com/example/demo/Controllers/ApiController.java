package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("92")
	public int id;
	@Value("Srinath")
	public String name;
	@Value("19")
	public int age;
	@Value("1000000")
	public long salary;
	@RequestMapping("/")
	public String day()
	{
	return id+"-"+name+"-"+age+"-"+salary;
	}
}
