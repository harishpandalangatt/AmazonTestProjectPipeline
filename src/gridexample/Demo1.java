package gridexample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo1 {

	
	
    //To create the object as Remotewebdriver not as Webdriver
	public static RemoteWebDriver driver;
	@Test  //Passing Test
	public void Testcase1() throws MalformedURLException 
	{
		
		String URL = "http://192.168.56.1:4444/wd/hub";
		
		//Create an object for Desiredcapabilities and pass it based on your browser
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		

		//We need to pass the remote driver details with the hub url and the node capabilities 
		driver = new RemoteWebDriver(new URL(URL),capability);
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.close();
	
}
}