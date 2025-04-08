package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_009_HardAssert {
	
	
	// Assert provided by Testng
	@Test
	public void test_demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		// example 1
		String windowTitle = driver.getTitle();
		Assert.assertEquals(windowTitle, "Facebook - log in or sign up");
		
		// example 2
		Assert.assertTrue(windowTitle.contains("sign up"));
		
		// example 3
		Assert.assertNotEquals("apple", "ball");
		
		// example 4
		//Assert.fail();
		Assert.fail("\n===================================== \n there is already reported bug num = 1102 \n=======================================");
		
		System.out.println("current page title = "+driver.getTitle());
		System.out.println("current windows number(handle) = "+driver.getWindowHandle());
		driver.quit();
		
		
		
		
		
	}

}
