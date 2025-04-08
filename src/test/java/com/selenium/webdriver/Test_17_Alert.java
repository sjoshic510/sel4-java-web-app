package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_17_Alert {
	
	@Test
	public void test_alert_with_ok() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss(); //this is one way
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		//driver.quit();
	}
	
	@Test
	public void test_alert_with_ok_and_cancel() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();// dismiss=cancel button
		driver.switchTo().alert().accept(); // accept = ok button
		
		Thread.sleep(3000);
		//driver.quit();
		
		
	}
	
	@Test
	public void test_alert_with_textBook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("apple");
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		//driver.quit();
		
		
		
		}
	
	
	
	

}
