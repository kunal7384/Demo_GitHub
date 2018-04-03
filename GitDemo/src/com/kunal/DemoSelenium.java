package com.kunal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		
		driver.get("https://github.com/");
	System.out.println(driver.getTitle());
	
	driver.get("https://www.google.co.in");
	System.out.println(driver.getTitle());

	  
	  
		 
		
	}

}
