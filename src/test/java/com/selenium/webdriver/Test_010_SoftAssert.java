package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_010_SoftAssert {
	
	
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	@Test
	public void dateOfBirthDropDown() throws Exception {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys("Selenium");
	driver.findElement(By.name("lastname")).sendKeys("Panda");
	//Create the Object of the Select

	Select selectmonth = new Select(driver.findElement(By.id("month"))); //this constructor cannot remain empty
	//Select Class has many methods but the ones which are important are
	//select.selectByIndex()
	//select.selectByValue(null)
	selectmonth.selectByVisibleText("Jul");

	Select selectday = new Select(driver.findElement(By.id("day")));
	selectday.selectByVisibleText("25");

	Select selectyear = new Select(driver.findElement(By.id("year")));
	selectyear.selectByVisibleText("1996");

	driver.findElement(By.xpath("//input[@id = 'sex' and @value = '2']")).click();

	driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda500@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@id = 'referrer']/preceding::button")).click();
	Thread.sleep(10000);
	softassert.assertTrue(driver.findElement(By.xpath("//div[@class = 'uiHeaderActions']/following::h2")).isDisplayed());
	softassert.assertAll();

	}

	@AfterMethod
	public void tearDown() {
	//driver.quit();
	}

	}


