package com.simplemaven.framework.sampleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void Login()
	
	{
		System.out.println("firoj is a good boy");
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.uk");
		driver.close();
		System.out.println(" test pass");
		System.out.println("updated from git hub");
		
		System.out.println("datais november 1st");
		
	}
	
	

}
