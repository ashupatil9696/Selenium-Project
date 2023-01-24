package com.stepdefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.page.object.LoginPage;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_SD extends Utility {

	
	public static WebDriver driver;
//	Properties prop=new Properties();
	
	public Login_SD(WebDriver driverInstance) {
        super();
    }
	public Login_SD() {
		
	}


	@Given("User is on Login page")
	public void user_is_on_login_page() throws IOException, InterruptedException {

		AutomationBase.launchApp(getAppUrl());
		Thread.sleep(1000);
	 }

	@Given("User Clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    clickElement(LoginPage.login);
	    Thread.sleep(1000);
	}

	@Then("Invalid request message should appear")
	public void invalid_request_message_should_appear() throws InterruptedException {
		System.out.println("Invalid login");
		Thread.sleep(1000);
	}

	@Given("User enters only username with <{string}>")
	public void user_enters_only_username_with(String string) throws InterruptedException {
	    sendKeys(LoginPage.username, string);
	    Thread.sleep(1000);
	}
	

	@Given("User enters only password with <{string}>")
	public void user_enters_only_password_with(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    sendKeys(LoginPage.password, string);
	    Thread.sleep(1000);
	}

	@Given("User enters username with <{string}>")
	public void user_enters_username_with(String string) throws InterruptedException {
	    sendKeys(LoginPage.username, string);
	    Thread.sleep(1000);
	}

	@Given("User enters password with <{string}>")
	public void user_enters_password_with(String string) throws InterruptedException {
		sendKeys(LoginPage.password, string);
		Thread.sleep(1000);
	}

	@Then("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
	    {
			//System.out.println("User is on login page");
	    	Utility.AssertTitle("Account Services");
	    	Thread.sleep(1000);
		}
	    
	}
	
	


}