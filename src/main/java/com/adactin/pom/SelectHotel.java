package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")

	private WebElement SelectHotel;

	@FindBy(id = "continue")

	private WebElement Continue;

	public SelectHotel(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
