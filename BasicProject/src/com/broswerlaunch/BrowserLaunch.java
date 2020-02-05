package com.broswerlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://selenium.dev/");
		
		//System.setProperty("webdriver.gecko.driver","D:\\testing\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.get("https://selenium.dev/");
		
		
		
	

	}

}
