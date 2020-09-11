package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotel;
import com.adactin.pom.Bookingconformation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	
	public static WebDriver driver= TestRunner.driver;
	PageObjectManager pom =new PageObjectManager(driver);

@Given("^User launch the application$")
public void user_launch_the_application() throws Throwable {
	//driver=getBrowser("chrome");
	//getUrl("http://adactinhotelapp.com/");
	 String url = FileReaderManager.getInstance().getcrInstance().getUrl();
	 getUrl(url);
}



@Given("^user launch the Adactin application$")
public void user_launch_the_Adactin_application() throws Throwable {
	System.out.println("user launch the Adactin application");
	
}

@When("^user log into the application$")
public void user_log_into_the_application() throws Throwable {
	System.out.println("user log into the application");
}


@When("^User enters the valid \"([^\"]*)\"in the Username field$")
public void user_enters_the_valid_in_the_Username_field(String username) throws Throwable {
	inputtoelement(pom.getHp().getUsername(), "Bhuvanpupathy");
}

@When("^User enters the valid  \"([^\"]*)\"  in the password field$")
public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {


inputtoelement(pom.getHp().getPassword(), "Adactin@21");
}



@When("^User clicks on the login Button$")
public void user_clicks_on_the_login_Button() throws Throwable {
  // HomePage hp= new HomePage(driver)
	 clicktheelement(pom.getHp().getLogin());
    // clicktheelement(hp.getLogin());

}
	
	


@Then("^User verify the Homepage navigates to the search Hotel Page$")
public void user_verify_the_Homepage_navigates_to_the_search_Hotel_Page() throws Throwable {
	
	 Assert.assertEquals("A", "a");
	


}
@Given("^User choose the options under mutiple dropdownbox$")
public void user_choose_the_options_under_mutiple_dropdownbox() throws Throwable {


}
/*
@When("^User select the location on the location dropdown box$")
public void user_select_the_location_on_the_location_dropdown_box() throws Throwable {
	Thread.sleep(4000);
	//SearchHotelPage sp= new SearchHotelPage(driver);
   selectDropDown(pom.getSp().getLocation(), "value", "Sydney");
	//selectDropDown(sp.getLocation(), "value", "Sydney");
    }

@When("^User select the  hotels  on the Hotels dropdown box$")
public void user_select_the_hotels_on_the_Hotels_dropdown_box() throws Throwable {
	 // SearchHotelPage sp= new SearchHotelPage(driver);
	   selectDropDown(pom.getSp().getHotel(), "value", "Hotel Hervey");
	 // selectDropDown(sp.getHotel(), "value", "Hotel Hervey");
}

@When("^User select  the Room type on the  Roomtype dropdown box$")
public void user_select_the_Room_type_on_the_Roomtype_dropdown_box() throws Throwable {
//	SearchHotelPage sp= new SearchHotelPage(driver);
 selectDropDown(pom.getSp().getRoomType(), "value", "Standard");
	//selectDropDown(sp.getRoomType(), "value", "Standard");
	 
	 }

@When("^User select the Roomtype under the Numberofrooms  dropdown box$")
public void user_select_the_Roomtype_under_the_Numberofrooms_dropdown_box() throws Throwable {
	// SearchHotelPage sp= new SearchHotelPage(driver);
	selectDropDown(pom.getSp().getNumberofRooms(), "value", "2");
	// selectDropDown(sp.getNumberofRooms(), "value", "2");
	 }

@When("^User enters the valid checkIn date in the checkin datebox$")
public void user_enters_the_valid_checkIn_date_in_the_checkin_datebox() throws Throwable {
	//SearchHotelPage sp= new SearchHotelPage(driver);
 inputtoelement(pom.getSp().getCheckinDate(), "19/08/2020");
	
	//inputtoelement(sp.getCheckinDate(), "17/08/2020" );
	 }

@When("^User enter the valid  checkout date in the checkout datebox$")
public void user_enter_the_valid_checkout_date_in_the_checkout_datebox() throws Throwable {
	// SearchHotelPage sp= new SearchHotelPage(driver);
	inputtoelement(pom.getSp().getCheckoutDate(), "20/08/2020");
	// inputtoelement(sp.getCheckoutDate(), "18/08/2020");
	 
	 }

@When("^User select the Numberof Adult in the AdultsperRoom box$")
public void user_select_the_Numberof_Adult_in_the_AdultsperRoom_box() throws Throwable {
	// SearchHotelPage sp= new SearchHotelPage(driver);
selectDropDown(pom.getSp().getAdultperRoom()," value","3");
	// selectDropDown(sp.getAdultperRoom(), " value","3");
	 }

@When("^User select the Numberof Children in the Childrenperroom box$")
public void user_select_the_Numberof_Children_in_the_Childrenperroom_box() throws Throwable {
	//SearchHotelPage sp= new SearchHotelPage(driver);
	selectDropDown(pom.getSp().getNumberofChild(),"value", "3");
	//selectDropDown(sp.getNumberofChild()," value","3");
	
	}*/


@When("^User clicks the Search the button$")
public void user_clicks_the_Search_the_button() throws Throwable {
	//  SearchHotelPage sp= new SearchHotelPage(driver);
	 clicktheelement(pom.getSp().getSearch());
	//  clicktheelement(sp.getSearch());
}

@When("^User select the location \"([^\"]*)\" as \"([^\"]*)\" on the location dropdown box$")
public void user_select_the_location_as_on_the_location_dropdown_box(String value, String location) throws Throwable {
	   selectDropDown(pom.getSp().getLocation(), "value", "Sydney");
	 //  Assert.assertEquals("A", "a");

}

@When("^User select the  hotels \"([^\"]*)\" as \"([^\"]*)\" on the Hotels dropdown box$")
public void user_select_the_hotels_as_on_the_Hotels_dropdown_box(String value, String hotel) throws Throwable {
	   selectDropDown(pom.getSp().getHotel(), "value", "Hotel Hervey");

}

@When("^User select  the Room type \"([^\"]*)\" as \"([^\"]*)\" on the  Roomtype dropdown box$")
public void user_select_the_Room_type_as_on_the_Roomtype_dropdown_box(String value, String roomtype) throws Throwable {
	 selectDropDown(pom.getSp().getRoomType(), "value", "Standard");

}

@When("^User select the Roomtype \"([^\"]*)\" as \"([^\"]*)\" under the Numberofrooms  dropdown box$")
public void user_select_the_Roomtype_as_under_the_Numberofrooms_dropdown_box(String value, String numberofrooms) throws Throwable {
	selectDropDown(pom.getSp().getNumberofRooms(), "value", "2");


}

@When("^User enters the valid checkIn date\"([^\"]*)\" in the checkin datebox$")
public void user_enters_the_valid_checkIn_date_in_the_checkin_datebox(String checkindate) throws Throwable {
	 inputtoelement(pom.getSp().getCheckinDate(), "23/08/2020");

}

@When("^User enter the valid  checkout date \"([^\"]*)\"in the checkout datebox$")
public void user_enter_the_valid_checkout_date_in_the_checkout_datebox(String checkoutdate) throws Throwable {
	inputtoelement(pom.getSp().getCheckoutDate(), "24/08/2020");

}

@When("^User select the Numberof Adult \"([^\"]*)\" as \"([^\"]*)\" in the AdultsperRoom box$")
public void user_select_the_Numberof_Adult_as_in_the_AdultsperRoom_box(String value, String adult) throws Throwable {
	selectDropDown(pom.getSp().getAdultperRoom(),"value","3");


}

@When("^User select the Numberof Children \"([^\"]*)\" as \"([^\"]*)\" in the Childrenperroom box$")
public void user_select_the_Numberof_Children_as_in_the_Childrenperroom_box(String arg1, String arg2) throws Throwable {
	
	selectDropDown(pom.getSp().getNumberofChild(), "value", "3");
}





@Then("^User verify the SearchHotel page and navigate to select Hotelspage$")
public void user_verify_the_SearchHotel_page_and_navigate_to_select_Hotelspage() throws Throwable {
}

@Given("^User verify the details and  click the RadioButton$")
public void user_verify_the_details_and_click_the_RadioButton() throws Throwable {
}

@When("^User click the RadioButton$")
public void user_click_the_RadioButton() throws Throwable {
	//SelectHotel  sh=new  SelectHotel(driver);
    clicktheelement(pom.getSh().getSelectHotel());
//	clicktheelement(sh.getSelectHotel());
	
}
@When("^User click the continue button$")
public void user_click_the_continue_button() throws Throwable {
	//SelectHotel  sh=new  SelectHotel(driver);
	clicktheelement(pom.getSh().getContinue());
	//clicktheelement(sh.getContinue());
}

@Then("^user navigate to the Book a Hotelpage$")
public void user_navigate_to_the_Book_a_Hotelpage() throws Throwable {
}

@Given("^User complete the booking process$")
public void user_complete_the_booking_process() throws Throwable {

}
/*
@When("^User enter the valid username in the username field$")
public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
	// BookHotel bh=new BookHotel(driver);
     inputtoelement(pom.getBh().getFirstName(), "Bhuvan");
	// inputtoelement(bh.getFirstName(), "Bhuvan");
}

@When("^User enter the vaild last name in the lastname field$")
public void user_enter_the_vaild_last_name_in_the_lastname_field() throws Throwable {
	// BookHotel bh=new BookHotel(driver);
	  inputtoelement(pom.getBh().getLastName(), "pupathy");}
	// inputtoelement(bh.getLastName(),"pupathy" );}

@When("^User enter the valid Billing address in the Billing field$")
public void user_enter_the_valid_Billing_address_in_the_Billing_field() throws Throwable {
//	BookHotel bh=new BookHotel(driver);
	  inputtoelement(pom.getBh().getAddress(), "kuberan nager,madipakkam,chennai-91");
	
	//inputtoelement(bh.getAddress(), "kuberan nager,madipakkam,chennai-91");
}

@When("^User enter the creditcard number in the corresponding field$")
public void user_enter_the_creditcard_number_in_the_corresponding_field() throws Throwable {
	//BookHotel bh=new BookHotel(driver);
     inputtoelement(pom.getBh().getCreditCardNo(), "9626626705934433");
//	inputtoelement(bh.getCreditCardNo(), "9626626705934433");

	}

@When("^User Select the credit card type in the credit  card type drop down box$")
public void user_Select_the_credit_card_type_in_the_credit_card_type_drop_down_box() throws Throwable {
	// BookHotel bh=new BookHotel(driver);
	 	// inputtoelement(bh.getCreditCardType(), "MAST");
	 	


}

@When("^User select the creditcard expire year and month in the drop down box$")
public void user_select_the_creditcard_expire_year_and_month_in_the_drop_down_box() throws Throwable {
	// BookHotel bh=new BookHotel(driver);
		 selectDropDown(pom.getBh().getEmonth(), "value","2");
		 selectDropDown(pom.getBh().getEyear(),"value","2021");
	// selectDropDown(bh.getEmonth(),  "value","2");
	// selectDropDown(bh.getEyear(), "value","2021");


}

@When("^User enter the valid Cvv number in the cvv number box$")
public void user_enter_the_valid_Cvv_number_in_the_cvv_number_box() throws Throwable {
	// BookHotel bh=new BookHotel(driver);
	  inputtoelement(pom.getBh().getCvvNumber(), "8898");
	// inputtoelement(bh.getCvvNumber(), "8898");


}*/

@When("^User enter the valid username \"([^\"]*)\" in the username field$")
public void user_enter_the_valid_username_in_the_username_field(String username) throws Throwable {
    inputtoelement(pom.getBh().getFirstName(), "Bhuvan");

}

@When("^User enter the vaild last name \"([^\"]*)\" in the lastname field$")
public void user_enter_the_vaild_last_name_in_the_lastname_field(String password) throws Throwable {
	  inputtoelement(pom.getBh().getLastName(), "pupathy");}



@When("^User enter the valid Billing address \"([^\"]*)\"in the Billing field$")
public void user_enter_the_valid_Billing_address_in_the_Billing_field(String address) throws Throwable {
	  inputtoelement(pom.getBh().getAddress(), "kuberan nager,madipakkam,chennai-91");

}

@When("^User enter the creditcard number \"([^\"]*)\" in the corresponding field$")
public void user_enter_the_creditcard_number_in_the_corresponding_field(String creditcardnumber) throws Throwable {
    inputtoelement(pom.getBh().getCreditCardNo(), "9626626705934433");

}

@When("^User Select the credit card type \"([^\"]*)\" as \"([^\"]*)\" in the credit  card type drop down box$")
public void user_Select_the_credit_card_type_as_in_the_credit_card_type_drop_down_box(String value, String cardtype) throws Throwable{
	
selectDropDown(pom.getBh().getCreditCardType(), "value","MAST");
	
}

@When("^user enter the expire month \"([^\"]*)\" as \"([^\"]*)\" and year \"([^\"]*)\" as \"([^\"]*)\" in the coressponding field$")
public void user_enter_the_expire_month_as_and_year_as_in_the_coressponding_field(String value, String month, String value1, String year)throws Throwable {
	 selectDropDown(pom.getBh().getEmonth(), "value","2");
	 selectDropDown(pom.getBh().getEyear(),"value","2021");
}

@When("^User enter the valid Cvv number \"([^\"]*)\" in the cvv number box$")
public void user_enter_the_valid_Cvv_number_in_the_cvv_number_box(String cvvnumber) throws Throwable {
	  inputtoelement(pom.getBh().getCvvNumber(), "8898");


}


@When("^User click the Book now Button$")
public void user_click_the_Book_now_Button() throws Throwable {
	 // BookHotel bh=new BookHotel(driver);
	  clicktheelement(pom.getBh().getBookNow());
	 // clicktheelement(bh.getBookNow());
	  }

@Then("^verify the Book a Hotel page and navigate to Booking confirmation page$")
public void verify_the_Book_a_Hotel_page_and_navigate_to_Booking_confirmation_page() throws Throwable {
}

@Given("^User verify and logout the Website$")
public void user_verify_and_logout_the_Website() throws Throwable {

}

@When("^User click the logout Button$")
public void user_click_the_logout_Button() throws Throwable {
	//Bookingconformation bc= new Bookingconformation(driver);
	clicktheelement(pom.getBc().getLogout());
	//clicktheelement(bc.getLogout());
}

@Then("^verify  the Booking confirmation page and navigate the website$")
public void verify_the_Booking_confirmation_page_and_navigate_the_website() throws Throwable {


}
}
