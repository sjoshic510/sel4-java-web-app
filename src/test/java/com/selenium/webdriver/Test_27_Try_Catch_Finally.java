package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_27_Try_Catch_Finally {
	
	WebDriver driver;
	
	@Test
	public void demo() throws InterruptedException{
			
	try {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");	
		WebElement txt_firstName = driver.findElement(By.xpath("//input[@placeholder='First Nam']"));
		txt_firstName.sendKeys("bianca");
		
		
		
	} catch (Exception e) {
		
		System.out.println("message ====>"+e.getMessage());
		
	}finally {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	}
}
