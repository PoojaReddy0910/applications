package com.ojas1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController {
	@RequestMapping("/")
	public String processRequest() {
		return "second";
}

}
