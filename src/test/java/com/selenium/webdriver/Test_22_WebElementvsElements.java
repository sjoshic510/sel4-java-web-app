package com.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_22_WebElementvsElements {
	
	
	@Test
	public void testPractice() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> eles = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		
		for(WebElement ele :eles ) {
			
			System.out.println(ele.getText());		
		}
		
		
		Thread.sleep(3000);
		driver.quit();

	
	}
}
