package com.java;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmployeeController {
	public String display(Model m)	{
		System.out.println("in display method");
		m.addAttribute("emp", new Employee());
		return "view";
	}
	@RequestMapping("/helloagain")
	public String submitForm( @Valid @ModelAttribute("emp") Employee e, BindingResult br)	{
		System.out.println("inside submitform");

		if(br.hasErrors())		{
			return "view";
		}
		else
		{
		return "final";
		}
	}
}


