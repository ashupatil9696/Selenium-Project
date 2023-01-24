package com.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driverInstance) {
        PageFactory.initElements(driverInstance, this);
        driver = driverInstance;
    }
	
	
	@FindBy(xpath = "//input[@value='Log In']")
	public static WebElement login;
	
	@FindBy(xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//p[@class='error']")
	public static WebElement invalid;
	
	@FindBy(xpath = "//a[normalize-space()='Accounts Overview']")
	public static WebElement accountov;
	
	@FindBy(xpath = "//a[normalize-space()='Update Contact Info']")
	public static WebElement profile;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	public static WebElement contact;
	
	@FindBy(xpath = "//input[@value='Update Profile']")
	public static WebElement update ;
	
	@FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
	public static WebElement transferfund;
	
	@FindBy(xpath = "//input[@id='amount']")
	public static WebElement amount;
	
	@FindBy(xpath = "//input[@value='Transfer']")
	public static WebElement transfer;
	
	@FindBy(xpath = "//a[normalize-space()='Request Loan']")
	public static WebElement loan;
	
	@FindBy(xpath = "//input[@id='amount']")
	public static WebElement lamount;
	
	@FindBy(xpath = "//input[@id='downPayment']")
	public static WebElement dpayment;
	
	@FindBy(xpath = "//input[@value='Apply Now']")
	public static WebElement apply;
	
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	public static WebElement logout;
	
	@FindBy(xpath = "//h2[normalize-space()='Account Services']")
	public static WebElement title;
	
	
	}