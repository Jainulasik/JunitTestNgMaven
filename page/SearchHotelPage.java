package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(name = "hotels")
	private WebElement hotels;

	public WebElement gethotels() {
		return hotels;
	}

	@FindBy(name = "room_type")
	private WebElement Roomtype;

	public WebElement getRoomtype() {
		return Roomtype;
	}

	@FindBy(name = "room_nos")
	private WebElement NumofRooms;

	public WebElement getNumofRooms() {
		return NumofRooms;
	}

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement outDate;

	public WebElement getcheckOutDate() {
		return outDate;
	}

	@FindBy(name = "adult_room")
	private WebElement adultPerRoom;

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	@FindBy(name = "child_room")
	private WebElement childPerRoom;

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	@FindBy(name = "Submit")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy (xpath = "//input[@id='radiobutton_0']")
	private WebElement selectHotelElement;
	public WebElement getSelectHotelElement() {
		return selectHotelElement;
	}
	
	@FindBy (id ="continue")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}

}
