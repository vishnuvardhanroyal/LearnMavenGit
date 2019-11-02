package com.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.logs.GenLog;

public class AllWaits {
	
	public static void wait(String name, String text) throws InterruptedException {
		switch ("implicit") {
		case "implicit":
			BaseClass.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			GenLog.genLog("info", "implicit wait is initialized");
			break;
		case "Thread":
			Thread.sleep(3000);
			GenLog.genLog("info", "implicit wait is initialized");
			break;
		case "ExplicitAlert":
			WebDriverWait wait=new WebDriverWait(BaseClass.driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
		case "ExplicitText":
			WebDriverWait waitp=new WebDriverWait(BaseClass.driver, 30);
			waitp.until(ExpectedConditions.titleContains(text));
		default:
			break;
		}
	}

}
