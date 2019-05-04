package com.cucumber.stepdefinition;

import javax.net.ssl.HostnameVerifier;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.cucumber.testrunner.TestRunnerMac;
import com.test.resource.BaseClassNew;
import com.test.resource.PomSingleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepdefinitionMac extends BaseClassNew {
	public static WebDriver driver = TestRunnerMac.driver;
	public static PomSingleton p = new PomSingleton(driver);

	@Given("^User should be in Mac login page$")
	public void user_should_be_in_Mac_login_page() throws Throwable {
		get("https://www.maccosmetics.com");

	}

	@When("^User should click the signin button in the header$")
	public void user_should_click_the_signin_button_in_the_header() throws Throwable {
		moveToElement(p.getLoginPage().getSignIn());
		click(p.getLoginPage().getSignIn());

	}

	@When("^User should  enter EmailId in the Email Address field$")
	public void user_should_enter_EmailId_in_the_Email_Address_field() throws Throwable {
		sendKeys(p.getLoginPage().getEmailAddress(), "harnie04@yopmail.com");

	}

	@When("^User  should enter the password in the password field$")
	public void user_should_enter_the_password_in_the_password_field() throws Throwable {
		sendKeys(p.getLoginPage().getPassword(), "Test123");

	}

	@When("^User should click the Submit button ito login the MAC application$")
	public void user_should_click_the_Submit_button_ito_login_the_MAC_application() throws Throwable {
		click(p.getLoginPage().getSubmitCred());

	}

	@When("^User should validate the login name displayed in the page is valid$")
	public void user_should_validate_the_login_name_displayed_in_the_page_is_valid() throws Throwable {
		String Usernameactual = p.getLoginPage().getUsernameinGnav().getText();
		org.junit.Assert.assertEquals("TEST", Usernameactual);
		System.out.println(Usernameactual);
	}

	@When("^User should  enter EmailId '(.*)' in the Email Address field$")
	public void user_should_enter_EmailId_EmailId_in_the_Email_Address_field(String EmailId) throws Throwable {
		sendKeys(p.getLoginPage().getEmailAddress(), EmailId);
	}

	@When("^User  should enter the password '(.*)' in the password field$")
	public void user_should_enter_the_password_password_in_the_password_field(String password) throws Throwable {
		sendKeys(p.getLoginPage().getPassword(), password);
	}

	@When("^User should validate the username '(.*)' displayed in the page is valid$")
	public void user_should_validate_the_login_name_username_displayed_in_the_page_is_valid(String username)
			throws Throwable {
		String actualname = p.getLoginPage().getUsernameinGnav().getText();
		org.junit.Assert.assertEquals(username, actualname);
		System.out.println(actualname);
	}

	@When("^User mouse hover to username in the header$")
	public void user_mouse_hover_to_username_in_the_header() throws Throwable {
		click(p.getLoginPage().getGnavSignin());
	}

	@When("^User should move to Signout from page$")
	public void user_should_move_to_Signout_from_page() throws Throwable {
		click(p.getLoginPage().getSignout());
	}
}