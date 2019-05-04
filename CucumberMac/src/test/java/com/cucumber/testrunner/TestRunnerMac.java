package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.test.resource.BaseClassNew;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src\\test\\resource\\com\\cucumber\\reports",
		"junit:src\\test\\resource\\com\\cucumber\\reports.xml",
		"json:src\\test\\resource\\com\\cucumber\\reports.json"},
features={"C:\\Users\\harni\\Documents\\CucumberMac\\src\\test\\java\\com\\cucumber\\features\\MacProductsNav.feature"},
glue= {"com.cucumber.stepdefinition"},tags= {"@TC1,@TC2"},monochrome=true)

public class TestRunnerMac {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
	 driver = BaseClassNew.browserLaunch("chrome");
	}
	
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
	
}
