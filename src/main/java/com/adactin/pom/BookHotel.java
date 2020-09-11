package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	
public static WebDriver driver;

public BookHotel(WebDriver Bdriver) {
	this.driver=Bdriver;
	PageFactory.initElements(driver, this);
	
	
}@FindBy(xpath="//input[@id='first_name']")

private WebElement firstName;
@FindBy(xpath="//input[@id='last_name']")
private WebElement lastName;
@FindBy(xpath="//textarea[@name='address']")
private WebElement address;
@FindBy(xpath="//input[@id='cc_num']")
private WebElement creditCardNo;
@FindBy(xpath="//select[@id='cc_type']")
private WebElement creditCardType;
@FindBy(xpath="//select[@id='cc_exp_month']")
private WebElement emonth;
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement eyear ;
@FindBy(xpath="//*[@id=\"cc_cvv\"]")
private WebElement cvvNumber;
@FindBy(xpath="//input[@id='book_now']")
private WebElement bookNow;
public static WebDriver getDriver() {
	return driver;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditCardNo() {
	return creditCardNo;
}
public WebElement getCreditCardType() {
	return creditCardType;
}
public WebElement getEmonth() {
	return emonth;
}
public WebElement getEyear() {
	return eyear;
}
public WebElement getCvvNumber() {
	return cvvNumber;
}
public WebElement getBookNow() {
	return bookNow;
}
	
	

}
