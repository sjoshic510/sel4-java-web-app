package com.sel.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01_Verify_Homepage extends BaseClass{
	
	@Test
	public void verify_homepage() {
		WebElement lbl_dashboard = driver.findElement(By.xpath("//h6[normalize-space()=\"Dashboard\"]"));
		
		Assert.assertEquals(lbl_dashboard.getText(), "Dashboard");
	    
		
		
	}

}
