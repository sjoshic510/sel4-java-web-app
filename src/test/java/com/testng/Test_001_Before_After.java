package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_001_Before_After {
  private WebDriver driver;
  
    @BeforeMethod
    public void setUp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	 
 }
	
	@Test
	public void enterFirstName() {
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("bianca");
	
	}
	
	@Test
	public void enterLastName() {
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("chhetri");
	
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	
	}
	

}
