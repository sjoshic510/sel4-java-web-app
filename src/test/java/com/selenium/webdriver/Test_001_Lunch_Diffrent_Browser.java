package com.selenium.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_001_Lunch_Diffrent_Browser {
	
	private WebDriver driver;
	String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";
	
	@BeforeMethod
	public void setUp() {
		System.out.println("other classes we write browser lunch here");
	}
	
	@Test
	public void test_lunch_chrome() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get(baseUrl);
		
	}
	
	@Test
	public void test_lunch_msedge() throws InterruptedException {
	    driver = new EdgeDriver();	
		driver.get(baseUrl);	
		
	}
	
	@Test
	public void test_lunch_firefox() throws InterruptedException {
		driver = new FirefoxDriver();	
		driver.get(baseUrl);
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
