package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	private WishMessageGenerator(Date date) {
		this.date = date;
	}

	/*public void setDate(Date date) {
		this.date=date;
	}*/

	public String generateMessage(String user) {
		// get current hour of the day
		int hour = date.getHours() + 1;
		if (hour < 12)
			return "GM " + user;
		else if (hour < 16)
			return "GA " + user;
		else if (hour < 18)
			return "GE " + user;
		else
			return "GN " + user;
	}// generateMessage

}
