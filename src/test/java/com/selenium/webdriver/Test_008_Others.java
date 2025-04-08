package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_008_Others {
	
	@Test
	public void test_demo() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		System.out.println("current URL = "+driver.getCurrentUrl());
		System.out.println("current page title = "+driver.getTitle());
		System.out.println("current windows number(handle) = "+driver.getWindowHandle());
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
	
	

}
