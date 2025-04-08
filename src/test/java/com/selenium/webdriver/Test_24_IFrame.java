package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_24_IFrame {
	
	@Test
	public void testPractice() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		
		//By using  id= courses-iframe
		//driver.switchTo().frame("courses-iframe"); 
		
		//by using  name= iframe-name
		driver.switchTo().frame("iframe-name"); 
		
		driver.findElement(By.xpath("//select[@name=\"categories\"]")).click();
		
		Thread.sleep(3000);
		//driver.quit();
	
	}

}
