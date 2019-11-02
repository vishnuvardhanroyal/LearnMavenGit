package com.smoketest;

import java.io.IOException;

import org.junit.Test;

import com.generics.AllWaits;
import com.generics.BaseClass;
import com.generics.performActions;
import com.util.ConfigProperties;

public class LoginFunctionality {
	
	@Test
	public void verifyLoginwithValidCredentials() throws IOException, InterruptedException {
		BaseClass.browser(ConfigProperties.readProperty("browser"));
		BaseClass.browserActions("maximize");
		BaseClass.launchUrl(ConfigProperties.readProperty("url"));
		AllWaits.wait("implicit", "");
		performActions.performAction("id", "username", "sendkeys", "admin");
		performActions.performAction("name", "pwd", "sendkeys", "manager");
		performActions.performAction("partiallinktext", "Login", "click", "");
	}

}
