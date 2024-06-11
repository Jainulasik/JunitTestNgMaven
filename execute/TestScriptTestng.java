package org.execute;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestScriptTestng extends BaseClass {

	public static BaseClass base = new BaseClass();

	@Test
	private void Browserlaunch() {

		base.browserLaunch("chrome");

	}

	@Test
	private void urlLaunchh() {

		base.urlLaunch("https://adactinhotelapp.com/");
	}

	@Test
	private void usernameAndPassword() throws IOException {

		LoginPage login = new LoginPage();
		WebElement username = login.getUsername();
		username.sendKeys(base.readExcel(1, 0));

		WebElement password = login.getPassword();
		password.sendKeys(base.readExcel(1, 1));
	}

	@AfterTest
	private void loginClick() {

		LoginPage login = new LoginPage();
		WebElement loginbuton = login.getLoginbuton();
		base.buttonClick(loginbuton);
	}

}
