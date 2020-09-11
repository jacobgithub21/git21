package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconformation {
	
	
	public static WebDriver driver;
	
	public Bookingconformation(WebDriver Cdriver) {
		this.driver=Cdriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='logout']")
	
	private WebElement  logout;



	public WebElement getLogout() {
		return logout;
	}

}
