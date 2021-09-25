package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	//setter method for assigning or injecting the dependent class object to target class object. 
	public void setDate(Date date) {
		this.date=date;
	}
	
	//method having b.logic
	public String generateMessage(String user) {
		//get current hour of the day
		int hour=date.getHours()+1;
		if(hour<12)
			return "GM "+user;
		else if(hour<16)
			return "GA "+user;
		else if(hour<18)
			return "GE "+user;
		else
			return "GN "+user;
	}//generateMessage
	
}
