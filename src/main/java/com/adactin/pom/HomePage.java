package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
public static WebDriver driver;
	
	public HomePage(WebDriver Hdriver) {
		this.driver=Hdriver;
		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	
	private WebElement Username;
	
	
	@FindBy(xpath="//input[@id='password']")
	
	private WebElement password;
	
	
	@FindBy(id="login")
	private WebElement login;


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}

}
