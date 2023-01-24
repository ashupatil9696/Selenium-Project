package com.stepdefinitions;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.page.object.LoginPage;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class App_SD extends Utility{
	String username = "xyz1234@gmail.com";
	String pass = "Patil@123";
	
	public App_SD() {
		
	}
	
	public App_SD(WebDriver driver) {
		super();
	}

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() throws IOException, InterruptedException {
	   AutomationBase.launchApp(getAppUrl());
	   Thread.sleep(2000);
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() throws InterruptedException {
		Thread.sleep(1000);
        clickElement(LoginPage.username);
		sendKeys(LoginPage.username,username );
		sendKeys(LoginPage.password,pass );

	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() throws InterruptedException {
		Thread.sleep(1000);
	   clickElement(LoginPage.login);
	}
	@Given("User is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException {
		Thread.sleep(1000);
	   String title= driver.getTitle();
	   System.out.println("page tile:" + title);
	}

	@When("User clicks on drop down")
	public void user_clicks_on_drop_down() throws InterruptedException {
		Thread.sleep(1000);
	    
	}

	@When("selects a account overview")
	public void selects_a_account_overview() throws InterruptedException {
		Thread.sleep(1000);
	   clickElement(LoginPage.accountov);
	}

	@Then("User should get the results")
	public void user_should_get_the_results() throws InterruptedException {
		Thread.sleep(1000);
	    
	}

	@Given("User should be on the home page")
	public void user_should_be_on_the_home_page() throws InterruptedException {
		Thread.sleep(1000);
	    
	}

	@Given("Update info is selected")
	public void update_info_is_selected() throws InterruptedException {
		Thread.sleep(1000);
		clickElement(LoginPage.profile);
	}

	@When("User clicks on contact field <{string}>")
	public void user_clicks_on_contact_field(String string) throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).clear();
	    sendKeys(LoginPage.contact,string);
	}

	@Then("Profile is updated")
	public void profile_is_updated() throws InterruptedException {
		Thread.sleep(1000);
	    clickElement(LoginPage.update);
	}

	@When("User clicks on amount <{string}>")
	public void user_clicks_on_amount(String string) throws InterruptedException {
		Thread.sleep(1000);
		clickElement(LoginPage.transferfund);
		sendKeys(LoginPage.amount,string);
		
	}

	@Then("Amount should get transferd")
	public void amount_should_get_transferd() throws InterruptedException {
		Thread.sleep(1000);
	    clickElement(LoginPage.transfer);
	}

	@When("User selects the loan amount <{string}>")
	public void user_selects_the_loan_amount(String string) throws InterruptedException {
		Thread.sleep(1000);
		clickElement(LoginPage.loan);
		sendKeys(LoginPage.lamount,string);
	}

	@When("User selects the downpayment amount <{string}>")
	public void user_selects_the_downpayment_amount(String string) throws InterruptedException {
		Thread.sleep(1000);
		sendKeys(LoginPage.dpayment,string);
	}

	@Then("Loan request gets submitted")
	public void loan_request_gets_submitted() throws InterruptedException {
		Thread.sleep(1000);
	    clickElement(LoginPage.apply);
	}

	@When("User clicks on the logout button")
	public void user_clicks_on_the_logout_button() throws InterruptedException {
		Thread.sleep(1000);
	    clickElement(LoginPage.logout);
	}

	@Then("User should be logged out")
	public void user_should_be_logged_out() throws InterruptedException {
		Thread.sleep(1000);
	    
	}

}
