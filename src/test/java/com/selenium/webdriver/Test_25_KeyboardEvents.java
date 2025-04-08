package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_25_KeyboardEvents {
	
	
	
	@Test
	public void testPractice() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dd_countries = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		dd_countries.sendKeys("nep");
		Thread.sleep(3000);
		dd_countries.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN.ENTER) ;	
		
		Thread.sleep(3000);
		driver.quit();	
		
}
}