Feature: testing of Booking functionality in Adactin Application

Background: 
       Given   user launch the Adactin application
       When    user log into the application
 
@SmokeTest
Scenario Outline:   Verify the User is able to login the application 
	Given User launch the application 
	When  User enters the valid "<username>"in the Username field 
	And   User enters the valid  "<password>"  in the password field 
	And   User clicks on the login Button 
	Then  User verify the Homepage navigates to the search Hotel Page
	
Examples:
         |username|password|
         |AAAA|1111|
         |BBBB|2222|
         |Bhuvanpupathy|Adactin@21|


 

Scenario: Verify the user is able to  select the Dropdown in the  SearchHotel Page 
	Given User choose the options under mutiple dropdownbox 
	When  User select the location "value" as "Sydney" on the location dropdown box 
	And   User select the  hotels "value" as "Hotel Hervey" on the Hotels dropdown box 
	And   User select  the Room type "value" as "Standard" on the  Roomtype dropdown box 
	And   User select the Roomtype "value" as "2" under the Numberofrooms  dropdown box 
	And   User enters the valid checkIn date"23/08/2020" in the checkin datebox 
	And   User enter the valid  checkout date "24/08/2020"in the checkout datebox 
	And   User select the Numberof Adult "value" as "3" in the AdultsperRoom box 
	And   User select the Numberof Children "value" as "3" in the Childrenperroom box 
	And   User clicks the Search the button 
	Then  User verify the SearchHotel page and navigate to select Hotelspage 
	
        
	
	
Scenario: Verify the user is able to click the RadioButton in the Select HotelPage 
	Given  User verify the details and  click the RadioButton 
	When   User click the RadioButton 
	And    User click the continue button 
	Then   user navigate to the Book a Hotelpage


Scenario: verify and add the user Addtional details  in the book a Hotelpage 

       Given  User complete the booking process
       When   User enter the valid username "Bhuvan" in the username field 
       And    User enter the vaild last name "pupathy" in the lastname field
       And    User enter the valid Billing address "kuberan nager,madipakkam,chennai-91"in the Billing field
       And    User enter the creditcard number "9626626705934433" in the corresponding field 
       And    User Select the credit card type "value" as " MAST" in the credit  card type drop down box
       And     user enter the expire month "value" as "2" and year "value" as "2021" in the coressponding field
       And    User enter the valid Cvv number "8898" in the cvv number box
       And    User click the Book now Button
       Then    verify the Book a Hotel page and navigate to Booking confirmation page
      
Scenario:  Verify the Booking Confirmation page
      Given  User verify and logout the Website
      And  User click the logout Button
      Then   verify  the Booking confirmation page and navigate the website	