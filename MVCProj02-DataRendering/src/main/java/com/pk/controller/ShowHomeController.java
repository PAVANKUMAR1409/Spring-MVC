package com.pk.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController 
{
		@RequestMapping("/")
		public String showHome(Map<String,Object> map) {
			System.out.println("map is refereing to "+map.getClass()); //org.springframework.validation.support.BindingAwareModelMap
			// put data in model attributes
			map.put("sysdate", new  Date());
			map.put("attri", "value1");
			map.put("personAge", new Random().nextInt(100));
			//return LVN(Logical View Name)
			return "welcome";
		}
}
