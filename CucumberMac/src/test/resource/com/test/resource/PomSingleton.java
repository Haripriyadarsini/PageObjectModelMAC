package com.test.resource;

import org.openqa.selenium.WebDriver;

import com.cucumber.macpom.LoginPage;

public class PomSingleton {

	public WebDriver driver;

	public PomSingleton(WebDriver ldriver) {
		this.driver = ldriver;
	}

	private LoginPage Lp = null;

	public LoginPage getLoginPage() {
		if (Lp == null)
			Lp = new LoginPage(driver);
		return Lp;

	}
}
