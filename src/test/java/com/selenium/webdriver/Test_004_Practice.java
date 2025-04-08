
package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_004_Practice {
	// Note:- sendkey,clear,click,dropdown,getText
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void practice() throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("devid");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		WebElement ddl = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select choose = new Select(ddl); 
		choose.selectByVisibleText("Option2");	
		
		String text = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']")).getText();
		System.out.println("printing text ======> "+ text);
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);	
		driver.quit();
		
	}
}
