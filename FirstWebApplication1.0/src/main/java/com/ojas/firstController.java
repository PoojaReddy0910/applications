package com.ojas;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {
	
	
		
	@RequestMapping("/")
		public String processRequest() {
			return "First";
	}
	}


