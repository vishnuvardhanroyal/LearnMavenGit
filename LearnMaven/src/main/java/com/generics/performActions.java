package com.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.logs.GenLog;

public class performActions {

	public static WebElement findLocator(String locator, String Value) {
		WebElement element;
		switch (locator) {
		case "id":
			element=BaseClass.driver.findElement(By.id(Value));
			GenLog.genLog("info", "id is retrieved");
			return element;
		case "name":
			element=BaseClass.driver.findElement(By.name(Value));
			GenLog.genLog("info", "name is retrieved");
			return element;
		case "partiallinktext":
			element=BaseClass.driver.findElement(By.partialLinkText(Value));
			GenLog.genLog("info", "partial link text is retrieved");
			return element;
		case "xpath":
			element=BaseClass.driver.findElement(By.xpath(Value));
			GenLog.genLog("xpath", "xpath is retrieved");
			return element;

		default:
			break;
		}
		return null;
	}
	
	public static void performAction(String locator, String Value, String action, String actiondata) {
		WebElement element=findLocator(locator, Value);
		switch (action) {
		case "sendkeys":
			element.sendKeys(actiondata);
			break;
		case "click":
			element.click();
			break;

		default:
			break;
		}

	}
}
