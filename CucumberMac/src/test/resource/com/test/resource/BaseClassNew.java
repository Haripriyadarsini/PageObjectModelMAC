package com.test.resource;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassNew {

	public static WebDriver driver;

	// 1.Browsers launch
	public static WebDriver browserLaunch(String browsername) throws Exception {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.IE.driver",
						System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			else if (browsername.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			else {
				System.out.println("The browser name is invalid");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.quit();
		return driver;
	}

	// Webdriver methods

	public static String getCurrentURL() {
		try {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getPageTitle() {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void get(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static String getPageSource() {
		try {
			String pageSource = driver.getPageSource();
			return pageSource;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void navigateTo(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void navigationCommands(String options) throws Exception {
		try {
			if (options.equalsIgnoreCase("Back")) {
				driver.navigate().back();
			} else if (options.equalsIgnoreCase("foward")) {
				driver.navigate().forward();
			} else if (options.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void quit() throws Exception {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void close() throws Exception {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void sendKeys(WebElement element, String text) throws Exception {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void click(WebElement element) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getText(WebElement element) {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	// TakesScreenshot

	public static void TakesScreenshot(WebDriver TakesScreenshot) throws IOException {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\harni\\Pictures\\Screenshots\\SS1.png");
			FileUtils.copyFile(temp, f);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
//WindowsHandle	

	public static void windowHandles(String Title) {

		try {
			String windowHandleParent = driver.getWindowHandle();
			Set<String> windowHandlesAll = driver.getWindowHandles();
			for (String allWindows : windowHandlesAll) {
				if (driver.switchTo().window(allWindows).getTitle().equals(Title)) {
					break;
				} else {
					driver.switchTo().window(windowHandleParent);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	// Alert,prompt,popups
	public static void waitforAlertISPresent() {
		try {

			WebDriverWait driverWait = new WebDriverWait(driver, 30);
			driverWait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void AlertBox() {

		try {
			waitforAlertISPresent();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void confirmBox(String options) {
		try {
			waitforAlertISPresent();
			Alert alert = driver.switchTo().alert();
			if (options.equalsIgnoreCase("Confirm")) {
				alert.accept();
			} else if (options.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void promptBox(String value, String options) {
		waitforAlertISPresent();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		if (options.equalsIgnoreCase("Confirm")) {
			alert.accept();
		} else if (options.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}

	}

	public static void waitForVisibilityOfElement(WebElement element) {
		try {
			WebDriverWait waitdriver = new WebDriverWait(driver, 30);
			waitdriver.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Select-Dropdown&ListBox
	public static void selectDropDown(WebElement element, String options, String value) {
		try {
			waitForVisibilityOfElement(element);
			Select select = new Select(element);

			if (options.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			} else if (options.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			} else if (options.equalsIgnoreCase("visibleText")) {
				select.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Actions
	public static void dragAndDrop(WebElement source, WebElement target) {
		try {
			waitForVisibilityOfElement(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		try {
			waitForVisibilityOfElement(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public static void contextClick(WebElement element) {
	
	try {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
//scrolldownandup

public static void scrolldownandup(WebElement element) {
	try {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView();" ,element);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void navigateToLogo(WebElement element) {
	
		try {
			JavascriptExecutor js=	(JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void scrollusingCoordinates(int Xaxis, int yaxis) {
		try {
			JavascriptExecutor js=	(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(X-axis,y-axis)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}



