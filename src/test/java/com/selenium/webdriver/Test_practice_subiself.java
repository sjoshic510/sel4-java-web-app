package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_practice_subiself {

	 private WebDriver driver;
	 
	 
	 @BeforeMethod()
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }
	 
	 
	 @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://demo.automationtesting.in/Register.html");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("subi");
	    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div/div[2]/input")).sendKeys("joshi");
	    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("65 bvgfhdjk");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("birhd@gmail.com");
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1236985478");
	  }
	 
	 @AfterMethod()
	  public void tearDown() throws Exception {
		Thread.sleep(Duration.ofSeconds(3));
	    driver.quit();
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}