package com.pk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsController {
	
		@GetMapping("/report")
		public String showData(@RequestParam Integer sno,@RequestParam String sname) {
			System.out.println(sno+"  "+sname);
			//return logical view name
			return "show_result";
			
		}
}
