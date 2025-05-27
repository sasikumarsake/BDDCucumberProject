package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.orangehrm.base.BaseTest;

public class LoginPage extends BasePage {
	
	static WebDriver driver;
	
	public LoginPage()
	{
		super(driver=BaseTest.getDriver());
		
		addObject("usernameTextbox", By.name("username"));
		addObject("passwordTextbox", By.name("password"));
		addObject("loginButton", By.xpath("//button[text()=' Login ']"));
	}
	
	
	

}