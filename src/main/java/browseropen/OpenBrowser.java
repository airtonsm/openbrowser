package browseropen;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public abstract class OpenBrowser {
	
	static WebDriver driver;	
	
	public static void browserChrome() throws Exception{	
		
		System.setProperty("webdriver.chrome.driver", "C:\\driverBrowser\\chromedriver.exe");		
		driver = new ChromeDriver();
		
	}
	
	public static void browserFirefox() throws Exception{	
		
		System.setProperty("webdriver.gecko.driver", "C:\\driverBrowser\\geckodriver.exe");			
		driver = new FirefoxDriver();		
	}		
}
