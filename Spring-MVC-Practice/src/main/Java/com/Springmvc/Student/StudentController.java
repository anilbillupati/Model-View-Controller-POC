package com.Springmvc.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class StudentController {
	
	@ResponseBody
	@GetMapping("/home")	
	public String showHomePage()
	{
		return "Viewing Student home page";
	}

}
