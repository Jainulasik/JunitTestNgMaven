package org.execute;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.BookaHotelPage;
import org.page.BookingConfirm_and_Logout;
import org.page.LoginPage;
import org.page.SearchHotelPage;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class TestScript2 extends BaseClass {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		BaseClass base = new BaseClass();
		base.browserLaunch("chrome");
		base.urlLaunch("https:www.adactinhotelapp.com");
		base.driver.manage().window().maximize();
		
		
	//Loginpage
		
		LoginPage login = new LoginPage();
		WebElement username = login.getUsername();
		username.sendKeys("Asik232425");
		
		WebElement password = login.getPassword();
		password.sendKeys(base.readExcel(1, 1));
		
		WebElement loginbuton = login.getLoginbuton();
		base.buttonClick(loginbuton);
		
		
		
	//SearchHotelpage
		
		SearchHotelPage hotel = new SearchHotelPage();
		WebElement location = hotel.getLocation();
		base.dropDowns(location, 3);
		
		WebElement gethotels = hotel.gethotels();
		base.dropDowns(gethotels, 2);
		
		WebElement roomtype = hotel.getRoomtype();
		base.dropDowns(roomtype, 1);
		
		WebElement numofRooms = hotel.getNumofRooms();
		base.dropDowns(numofRooms, 2);
		
		WebElement checkInDate = hotel.getCheckInDate();
		base.buttonClick(checkInDate);
		java.awt.Robot r = new java.awt.Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		base.sendText(checkInDate, "14/11/2024");
		
		WebElement checkOutDate = hotel.getcheckOutDate();
		base.buttonClick(checkOutDate);
		java.awt.Robot r1 = new java.awt.Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_A);
		base.sendText(checkOutDate, "16/11/2024");
		

		WebElement adultPerRoom = hotel.getAdultPerRoom();
		base.dropDowns(adultPerRoom, 2);
		
//		if(adultPerRoom.isDisplayed()
//				) {
//			
//		}
//		
//		
		
		WebElement childPerRoom = hotel.getChildPerRoom();
		base.dropDowns(childPerRoom, 3);
		
		WebElement searchButton = hotel.getSearchButton();
		base.buttonClick(searchButton);
		
		WebElement selectHotelElement = hotel.getSelectHotelElement();
        base.buttonClick(selectHotelElement);
		
		WebElement continuebutton = hotel.getContinuebutton();
		base.buttonClick(continuebutton);
		
    //BOOKHOTEL PAGE
		
		BookaHotelPage book = new BookaHotelPage();
		WebElement firstName = book.getFirstName();
		base.sendText(firstName, base.readExcel(1, 15));
		
		WebElement lastName = book.getLastName();
		base.sendText(lastName, base.readExcel(1, 16));
		
		WebElement billingAdress = book.getBillingAdress();
		base.sendText(billingAdress, base.readExcel(1, 17));
		
		WebElement creditcardNum = book.getCreditcardNum();
        creditcardNum.sendKeys("9865235785213654");
		
		
		WebElement creditCardType = book.getCreditCardType();
        base.selectbydropdown(creditCardType, "index", "2");
        
        WebElement expiryDate = book.getExpiryDate();
        base.selectbydropdown(expiryDate, "index", "2");
        
        WebElement expYear = book.getExpYear();
        base.selectbydropdown(expYear, "index", "14");
        
        WebElement cvvNumber = book.getCvvNumber();
        cvvNumber.sendKeys(base.readExcel(1, 1));
        
        WebElement bookNow = book.getBookNow();
        base.buttonClick(bookNow);
        
        base.sleep(6000);
        
        
     //BOOKING CONFIRMATIION AND LOGOUT
        
        BookingConfirm_and_Logout l = new BookingConfirm_and_Logout();
        WebElement bookConfirmation = l.getBookConfirmation();
        base.buttonClick(bookConfirmation);
        
        WebElement bookedItenary = l.getBookedItenary();
        base.buttonClick(bookedItenary);
        
        WebElement logout = l.getLogout();
        base.buttonClick(logout);
        
     //Taking Screenshot of Logout
        
        base.sleep(3000);
        base.screenCapture("Adaction LOg out done");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
