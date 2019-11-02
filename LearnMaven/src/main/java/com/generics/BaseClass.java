package com.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.logs.GenLog;

public class BaseClass {
	public static WebDriver driver;

	public static void browser(String key) {
		switch (key) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			GenLog.genLog("info", "chrome browser is initiated");
			break;
		case "firefox":
			driver=new FirefoxDriver();
			GenLog.genLog("info", "ff browser is initiated");
			break;
		case "ie":
			driver=new InternetExplorerDriver();
			GenLog.genLog("info", "ie browser is initiated");
			break;
		default:
			GenLog.genLog("info", "selected browser is not available");
			break;
		}
	}
	
	public static void browserActions(String action) {
		switch (action) {
		case "maximize":
			driver.manage().window().maximize();
			GenLog.genLog("info", "browser is maximized");
			break;
		case "deleteAllCookies":
			driver.manage().deleteAllCookies();
			GenLog.genLog("info", "cookies is deleted");
			break;	
		case "forward":
			driver.navigate().forward();
			GenLog.genLog("info", "forward action is done");
			break;
		case "back":
			driver.navigate().back();
			GenLog.genLog("info", "back action is done");
			break;

		default:
			break;
		}
	}
	
	public static void launchUrl(String url) {
		try {
			driver.get(url);
			GenLog.genLog("info", "url is launched");
		} catch (Exception e) {
			GenLog.genLog("error", "browser is not initialized");
		}
		
	}
}
