package testGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridTest {
	
	WebDriver driver;
	String baseUrl, nodeUrl;
	@Before
	public void setUp() throws MalformedURLException{
		baseUrl="http://google.com";
		//nodeUrl="http://172.21.36.113:5566/wd/hub";
		nodeUrl="http://localhost:5566/wd/hub";
		ChromeOptions capabilities = new ChromeOptions();

			driver=	new RemoteWebDriver(new URL(nodeUrl), capabilities);
	}
	@After
	public void afterTest(){
		driver.quit();
	}
	@Test
	public void simpleTest(){
		driver.get(baseUrl);
		//Assert.assertEquals("asdfg", driver.getTitle());///esto va a fallar 
		Assert.assertEquals("Google", driver.getTitle());
		
	}

    
}
