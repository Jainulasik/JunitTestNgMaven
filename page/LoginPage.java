package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class LoginPage extends BaseClass {


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
                                                                      //FindBys - If both value are true ,will execute only.
	                                                                  //Findall - If any value is true of both value ,it will execute
	@FindBy (xpath = "//*[@*='username']")
	private WebElement username ;

	public WebElement getUsername() {
		return username;
	}


	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	

	@FindBy(id = "login")
	private WebElement loginbuton;

	public WebElement getLoginbuton() {
		return loginbuton;
	}














}
