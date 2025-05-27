package com.orangehrm.pages;

import java.time.Duration;
import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.base.BaseTest;


public class BasePage extends BaseTest {

	WebDriver driver;
	
	HashMap<String,By> objectRepo=new HashMap<String,By>();
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void addObject(String logicalName,By by)
	{
		objectRepo.put(logicalName, by);
	}
	
	public void type(String logicalName,String text)
	{
		//driver.findElement(By.xpath("")).sendKeys(text);
		
		getElement(logicalName).sendKeys(text);
	}
	
	public void click(String logicalName)
	{
		getElement(logicalName).click();
	}


	private WebElement getElement(String logicalName) {
		
		By by=objectRepo.get(logicalName);
		
		waitForElementPresence(by);
		
		WebElement element=driver.findElement(by);
		
		return element;
		
		
	}
	
private void waitForElementPresence(By by) {
		
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(common.getProperty("explicitWait"))));
		myWait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	
	public void validateTitle(String expTitle)
	{
		
		Assert.assertTrue(driver.getTitle().equals(expTitle));
		
	}
	
}