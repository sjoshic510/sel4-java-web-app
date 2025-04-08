package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_002_SendKeys_Click {
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	

	@Test
	public void test_enter_click() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("apple");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
