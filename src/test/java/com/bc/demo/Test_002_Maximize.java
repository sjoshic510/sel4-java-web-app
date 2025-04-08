package com.bc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test_002_Maximize {

	@Test
	public void test_lunch_walmart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();

	}
	
	@Test
	public void test_lunch_amazon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
           	driver.quit();

	}
}
