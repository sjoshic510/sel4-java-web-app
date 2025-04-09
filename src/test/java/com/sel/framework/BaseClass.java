package com.sel.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
    @BeforeMethod
	public void setUp() {
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		logIn();
	}
	
    
       
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public void logIn() {
		WebElement txt_userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		txt_userName.sendKeys("Admin");
		
		WebElement txt_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txt_password.sendKeys("admin123");
		
		WebElement btn_login = driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}