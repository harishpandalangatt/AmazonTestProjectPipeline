package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	public static RemoteWebDriver driver;

	@Test
	
	public void LoginTest() throws MalformedURLException
	{
		String url = "http://192.168.56.1:4444/wd/hub";
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		
		
		driver = new RemoteWebDriver(new URL(url), caps);
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("")).sendKeys("");
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("tomsmith");
		
		driver.close();
		
	}

}
