package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_003_DropDown {
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
	}
	
	@Test
	public void selectDropdown() throws InterruptedException {
		
		WebElement ddOption2 = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(ddOption2);
		dropdown.selectByVisibleText("Option2");
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);	
		driver.quit();
		
	}
}
