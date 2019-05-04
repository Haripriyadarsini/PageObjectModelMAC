package com.cucumber.macpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	static WebDriver driver;
	

	@FindBy(id="site-my-mac")
	private WebElement SignIn;
	
	@FindBy(id="form--signin--field--EMAIL_ADDRESS")
	private WebElement EmailAddress;
	
	@FindBy(id="form--signin--field--PASSWORD")
	private WebElement Password;
	
	@FindBy(xpath="//input[@class='btn site-my-mac__contents-submit']")
	private WebElement SubmitCred;
	
	@FindBy(xpath="//*[@id='site-my-mac']/div")
	private WebElement UsernameinGnav;
	
	@FindBy(id="site-my-mac")
	private WebElement gnavSignin;
	
	@FindBy(xpath="//*[@id=\"node-30\"]/div/div/div[1]/div/section/ul/li[8]/a")
	private WebElement Signout;
	
	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmitCred() {
		return SubmitCred;
	}
	
	public WebElement getUsernameinGnav() {
		return UsernameinGnav;
		
	}
	
	public WebElement getGnavSignin() {
		return gnavSignin;
	}

	public WebElement getSignout() {
		return Signout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	
}
