package com.orangehrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	
	public String getProperty(String key)
	{
		FileInputStream fis1=null;
		
		try {
			fis1=new FileInputStream("src\\test\\resources\\properties\\application.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop=new Properties();
		
		try {
			prop.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value=prop.getProperty(key);
		
		return value;
		
		
	}
	

}