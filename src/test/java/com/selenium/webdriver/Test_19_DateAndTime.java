package com.selenium.webdriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Test_19_DateAndTime {
	
	
	
	@Test
	public void getCurrentDate() {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(new Date()));
		
		
	}
	@Test
	public void getCurrentDTime() {
		

		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm a");
		System.out.println(sdf2.format(new Date()));
	}
	
	
	
        
}
