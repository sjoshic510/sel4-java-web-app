package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_29_ShadowDomOrRoot {

	WebDriver driver;
	
	@Test
	public void demo(){
		
		driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		
		//driver.findElement(By.cssSelector("input[id=\"input\"]")).sendKeys("apple");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txt_bookSearch = (WebElement) (js.executeScript("return document.querySelector('body > book-app')"+ ".shadowRoot"+ ".querySelector('#input')"));
		txt_bookSearch.sendKeys("apple");
		
		
	}
	
}
