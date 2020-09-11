package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")

	private WebElement Hotel;

	@FindBy(xpath = "//select[@id='room_type']")

	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")

	private WebElement numberofRooms;

	@FindBy(xpath = "//input[@id='datepick_in']")

	private WebElement checkinDate;

	@FindBy(xpath = "//input[@id='datepick_out']")

	private WebElement checkoutDate;

	@FindBy(xpath = "//select[@id='adult_room']")

	private WebElement adultperRoom;

	@FindBy(xpath = "//select[@id='child_room']")

	private WebElement numberofChild;

	@FindBy(xpath = "//input[@id='Submit']")

	private WebElement search;
	
	public SearchHotelPage(WebDriver Sdriver) {
		this.driver = Sdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofRooms() {
		return numberofRooms;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdultperRoom() {
		return adultperRoom;
	}

	public WebElement getNumberofChild() {
		return numberofChild;
	}

	public WebElement getSearch() {
		return search;
	}

}
