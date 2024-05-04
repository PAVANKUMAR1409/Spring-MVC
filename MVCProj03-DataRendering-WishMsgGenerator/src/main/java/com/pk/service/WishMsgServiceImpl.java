package com.pk.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMsgServiceImpl implements IWishMsgService
{

	@Override
	public String genarateMsg() {
		// get system date and time
		LocalDateTime ldt = LocalDateTime.now();
		//get current hour of the day
		int hr=ldt.getHour();  //24 hour format
		// generate the wish message
		if(hr<12)
			return "GOOD MORNING";
		else if(hr<16)
			return "GOOD AFTERNOON";
		else if(hr<20)
			return "GOOD EVENING";
		else
			return "GOOD NIGHT";
		
	}

}
