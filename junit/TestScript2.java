package org.junit;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;


public class TestScript2  {

	
	public static BaseClass base = new BaseClass();

	@BeforeClass
	public static void browserLaunch() throws IOException {


		base.browserLaunch("ChroME");
		base.urlLaunch(base.readExcel(1, 2));

		
	}
	
	@Test
	public void LoginPage() throws IOException {
		
		LoginPage lo = new LoginPage();
		WebElement username = lo.getUsername();
		base.sendText(username, base.readExcel(1, 0));
		WebElement password = lo.getPassword();
		base.sendText(password, base.readExcel(1, 1));

	}
	
	
	
	
	
	
	
}
	
	
	