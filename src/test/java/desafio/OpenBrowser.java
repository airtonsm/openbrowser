package desafio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	WebDriver driver;
	
	public class OpenChrome extends GenericBrowser{
		
		
		
	}	
	
	
	public abstract class GenericBrowser{	
		public void chrome() throws Exception {				
			System.setProperty("webdriver.chrome.driver", "C:\\driverBrowser\\chromedriver.exe");			
			driver = new ChromeDriver();
			
		}
	}

}


