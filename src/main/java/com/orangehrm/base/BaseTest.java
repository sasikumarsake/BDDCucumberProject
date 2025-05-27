package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.exceptions.InvalidBrowserException;
import com.orangehrm.utils.CommonUtilities;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static CommonUtilities common=new CommonUtilities();
	
	public static void launchApplication()
	{
		
		driver=BaseTest.getDriver();
		
		driver.get(common.getProperty("url"));
				
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver()
	{
		if(driver==null)
		{
		String browserName=common.getProperty("browser");
		
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			
			break;

		case "firefox":
			driver = new FirefoxDriver();
			

			break;

		case "edge":
			driver = new EdgeDriver();
			
			break;

		default:
			try {
				throw new InvalidBrowserException();
			} catch (InvalidBrowserException e) {
				System.out.println(e.getMessage());
			}

			break;
		}

		
		}
		return driver;
		
	}
	

}