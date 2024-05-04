package com.pk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pk.service.IWishMsgService;

@Controller
public class WishMsgController
{
		@Autowired
		public IWishMsgService service;
		
		@RequestMapping("/")
		public String showHomePage() {
			return "welcome";
		}
		
		@RequestMapping("/wish")
		public String genarateMsg(Map<String,Object> map) {
			String msg=service.genarateMsg();
			map.put("wmsg", msg);
			return "show_result";
		}
}
