package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generics.AllWaits;
import com.generics.BaseClass;
import com.generics.performActions;
import com.util.ConfigProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("^the url and browser$")
	public void the_url_and_browser() throws Throwable {
	    /*// Write code here that turns the phrase above into concrete actions
		//To set the system property
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium\\\\chromedriver.exe");
		//To launch the browser
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");*/
		BaseClass.browser(ConfigProperties.readProperty("browser"));
		BaseClass.browserActions("maximize");
		BaseClass.launchUrl(ConfigProperties.readProperty("url"));
		AllWaits.wait("implicit", "");
	}

	@When("^we enter valid username and valid password$")
	public void we_enter_valid_username_and_valid_password() throws Throwable {
	    /*// Write code here that turns the phrase above into concrete actions
		//To find the username location 
		WebElement usernameRef=driver.findElement(By.id("username"));
		//To perform action on the username field
		usernameRef.sendKeys("admin");
		//To find the location of password field
		driver.findElement(By.name("pwd")).sendKeys("manager");*/
		performActions.performAction("id", "username", "sendkeys", "admin");
		performActions.performAction("name", "pwd", "sendkeys", "manager");
				
	}
	
	
	@When("^we enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void we_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		//To find the username location 
		WebElement usernameRef=driver.findElement(By.id("username"));
		//To perform action on the username field
		usernameRef.sendKeys(arg1);
		//To find the location of password field
		driver.findElement(By.name("pwd")).sendKeys(arg2);
	}

	
	

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   /* // Write code here that turns the phrase above into concrete actions
		//To find the location of login button
		driver.findElement(By.partialLinkText("Login")).click();*/
		performActions.performAction("partiallinktext", "Login", "click", "");
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login should be successful");
	}

}
