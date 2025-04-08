package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_005_GetAttribute {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	
	@Test
	public void GetAttribute()throws InterruptedException{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		String userNameAttribute = driver.findElement(By.xpath("//input[@id='Email']")).getDomAttribute("value");
		
		System.out.println("===>" + userNameAttribute);
	  
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
}
