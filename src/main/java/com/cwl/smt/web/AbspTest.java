package com.cwl.smt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AbspTest {

	@RequestMapping(value = "index1")
	public String testGoSuccessJsp() {
		System.out.println("***********************");
		return "index1";
	}

}
