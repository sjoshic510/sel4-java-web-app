package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_002_Priority {

	private WebDriver driver;

	@AfterMethod
	public void cleanUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
	}

	@Test(priority = 1)
	public void testCheck() {
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();	
		
	}

	@Test(priority = 3)
	public void testSendKey() {
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("yyyyyyyyyyy");	
		
	}

	
	@Test(priority = 2)
	public void testGetText() {
		driver.findElement(By.xpath("//legend[normalize-space()='Auto Suggest Example']")).getText();	
		
	}
	
	
}
