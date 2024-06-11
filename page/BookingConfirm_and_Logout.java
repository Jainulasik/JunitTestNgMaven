package org.page;

import org.base.BaseClass;
import org.bouncycastle.jcajce.provider.symmetric.ChaCha.BaseCC20P1305;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class BookingConfirm_and_Logout extends BaseClass{




	public BookingConfirm_and_Logout() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='my_itinerary']")
	private WebElement bookConfirmation;
	public WebElement getBookConfirmation() {
		return bookConfirmation;
	}

	@FindBy(name ="check_all")
	private WebElement bookedItenary;
	public WebElement getBookedItenary() {
		return bookedItenary;
	}

	@FindBy(id = "logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
}
