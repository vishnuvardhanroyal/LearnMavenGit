package com.testscripts;

import java.io.IOException;

import com.generics.AllWaits;
import com.generics.BaseClass;
import com.generics.performActions;
import com.util.ConfigProperties;

public class verifyLogin {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.browser(ConfigProperties.readProperty("browser"));
		BaseClass.browserActions("maximize");
		BaseClass.launchUrl(ConfigProperties.readProperty("url"));
		AllWaits.wait("implicit", "");
		performActions.performAction("id", "username", "sendkeys", "admin");
		performActions.performAction("name", "pwd", "sendkeys", "manager");
		performActions.performAction("partiallinktext", "Login", "click", "");
	}
	
	

}
