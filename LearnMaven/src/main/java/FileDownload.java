import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FileDownload {
	
	public static void main(String[] args) throws AWTException {
		
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium\\\\chromedriver.exe");
		//To launch the browser
		WebDriver driver;
		String downloadFilepath = "C:\\Users\\User\\eclipse-workspace\\LearnJava";
			 
	       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", downloadFilepath);
	      
	       ChromeOptions options = new ChromeOptions();
	       options.setExperimentalOption("prefs", chromePrefs);
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
	       options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	 
	       driver = new ChromeDriver(options);  
	        driver.get("http://irctc.co.in");
	        Robot rb=new Robot();
	        rb.keyPress(KeyEvent.VK_TAB);
	        rb.keyPress(KeyEvent.VK_TAB);
	        rb.keyPress(KeyEvent.VK_TAB);
	        rb.keyPress(KeyEvent.VK_ENTER);
	       // driver.findElement(By.linkText("32 bit Windows IE")).click();
	}
			
	

}
