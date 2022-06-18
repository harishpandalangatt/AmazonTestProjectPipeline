package gridexample;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Headless {


	public static RemoteWebDriver driver;
	@Test  //Passing Test
	public void Testcase1() throws MalformedURLException 
	{
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	
	// Creating an object for Chromeoptions 
	ChromeOptions options = new ChromeOptions();  
	
	//We use Add Aruguments method to give run the test case in headless mode, also we ignore any certificates
	
	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
	
	// Pass the options arguments inside the browserdriver defenition
	
	driver = new ChromeDriver(options);
	
	driver.get("http://www.google.com");
	
	String url = driver.getCurrentUrl();
	
	String title = driver.getTitle();
	
	System.out.println(url);
	
	System.out.println(title);
	
}
}
