package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_28_recorder {
	
	private WebDriver driver;
	@Test
	  public void testUntitledTestCase() throws Exception {
		driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bija");
	   
	    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div/div[2]/input")).sendKeys("chhetri");
	    
	    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("113 tsthj");
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nhdt@gmail.com");
	   
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1236549873");
	    Thread.sleep(3000);
	    driver.quit();
	  }


}