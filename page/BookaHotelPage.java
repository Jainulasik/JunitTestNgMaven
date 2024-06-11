package org.page;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookaHotelPage extends BaseClass {


	public BookaHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(name = "address")
	private WebElement billingAdress;
	public WebElement getBillingAdress() {
		return billingAdress;
	}
	

	@FindBy(name = "cc_num")
	private WebElement creditcardNum;
		public WebElement getCreditcardNum() {
			return creditcardNum;
		}
	

	@FindBy(id = "cc_type")
    private WebElement creditCardType;
	public WebElement getCreditCardType() {
		return creditCardType;
	}

    
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	public WebElement getExpiryDate() {
		return expiryMonth;
	}
	
	@FindBy(id = "cc_exp_year")
	private WebElement expYear;
	public WebElement getExpYear() {
		return expYear;
	}
	
	@FindBy(name ="cc_cvv")
	private WebElement cvvNumber ;
	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	@FindBy(id = "book_now")
	private WebElement bookNow;
	public WebElement getBookNow() {
		return bookNow;
	}

}
