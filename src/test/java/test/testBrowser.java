package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBrowser {
	
	private WebDriver driver;
	

	@Before
	public void setUp() throws Exception {		
		System.setProperty("webdriver.chrome.driver", "C:\\driverBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
