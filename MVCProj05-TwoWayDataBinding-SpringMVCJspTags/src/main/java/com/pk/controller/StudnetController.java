package com.pk.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pk.dao.Student;

@Controller
public class StudnetController
{
		@GetMapping("/")
		public String showHomePage() {
			return "welcome";
		}
		
		@GetMapping("/student")
		public String createForm(@ModelAttribute("stud") Student st) {
			System.out.println("Form Before details :: "+st);
			//lvn 
			return "student_form";
		}
		
		@PostMapping("/student")
		public String getForm(@ModelAttribute("stud") Student st, Map<String,Object> map)
		{
			System.out.println("Form data :: "+st);
			String res=null;
			if(st.getAvg()>35)
				res="PASS";
			else
				res="FAIL";
			map.put("resultData", res);
			return "show_result";
		}
		
		
}
