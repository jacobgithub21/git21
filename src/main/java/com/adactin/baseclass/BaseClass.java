package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Browser");

			}
			
		//	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	

	}
	
   public static void getUrl(String Url) {

		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void waitForElementVisibility(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void inputtoelement(WebElement element, String value) {

		waitForElementVisibility(element);

		try {
			element.sendKeys(value);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void clicktheelement(WebElement element) {

		waitForElementVisibility(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static void movetoElement(WebElement element) {

		waitForElementVisibility(element);

		try {
			org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDown(WebElement element, String option, String value) {

		waitForElementVisibility(element);

		try {

			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);

			} else if (option.equalsIgnoreCase("index")) {

				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(srcfile, desfile);
		
		
		
	}

}
