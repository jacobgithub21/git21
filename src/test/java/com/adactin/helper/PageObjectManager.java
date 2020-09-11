package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.Bookingconformation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private  HomePage hp;
    private SearchHotelPage sp;
    private SelectHotel sh;
    private BookHotel bh;
    private Bookingconformation bc;
    
    public PageObjectManager(WebDriver Ldriver) {
    	this.driver=Ldriver;
    	}
      public HomePage getHp() {
    	hp=new HomePage(driver);
		return hp;
	}
	public SearchHotelPage getSp() {
		
		sp= new SearchHotelPage(driver);
		return sp;
	}
	public SelectHotel getSh() {
		sh=new SelectHotel(driver);
		return sh;
	}
	public BookHotel getBh() {
		bh=new BookHotel(driver);
		return bh;
	}
	public Bookingconformation getBc() {
		bc=new Bookingconformation(driver);
		return bc;
	}
	
}