package com.sel.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogIn extends BaseClass{
	
	public void logIn() {
		WebElement txt_userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		txt_userName.sendKeys("Admin");
		
		WebElement txt_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txt_password.sendKeys("admin123");
		
		WebElement btn_login = driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
		
	}
	
	
	
	

}
