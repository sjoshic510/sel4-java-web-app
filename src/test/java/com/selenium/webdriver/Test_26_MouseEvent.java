package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_26_MouseEvent {
	
	
	@Test
	public void slider_draAndDrop() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,700)");
		 Thread.sleep(3000);
		 WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(slider).dragAndDropBy(slider, 600, 0).build().perform();

		
		
		
		
		
		//driver.quit();
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
