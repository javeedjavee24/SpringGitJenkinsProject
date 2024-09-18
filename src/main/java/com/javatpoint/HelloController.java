package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/")
	public String display()
	{
		System.out.println("hi");
		System.out.println("hii");
		return "index";
	}	
}
