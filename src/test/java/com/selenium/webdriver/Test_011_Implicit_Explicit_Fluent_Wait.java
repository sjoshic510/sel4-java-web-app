package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_011_Implicit_Explicit_Fluent_Wait {
	
	@Test
	public void implicitWait() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //soft Wait
		
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("punturi");
		Thread.sleep(3000); //Hard wait not recomended BAD
		driver.quit();		
	}

	@Test
	public void explicitWait() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Loader.html");	
		driver.findElement(By.xpath("//button[text()='Run']")).click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(30));
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));//
		
		driver.findElement(By.xpath("//button[text()='Close']")).click(); //alert close button
			
		Thread.sleep(3000); //Hard wait not recomended BAD
		driver.quit();
		
	}
	
	
	
	@Test
	public void fluentWait() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Loader.html");	
		driver.findElement(By.xpath("//button[text()='Run']")).click();
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
						
		Thread.sleep(3000); //Hard wait not recomended BAD
		driver.quit();
		
	}
	
}
