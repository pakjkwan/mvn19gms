package com.gms.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	public String getNow(){
		return new SimpleDateFormat("yyyy?MM?dd?¼ a hh:mm:ss").format(new Date());
	} 

}
