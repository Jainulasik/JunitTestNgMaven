package org.junit;


import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;


public class TestScript1 {


	public static BaseClass base = new BaseClass();

	@BeforeClass
	public static void browserLaunch() throws IOException {

		base.browserLaunch("edge");
		
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
	
	
	
	
	

	
	
	
	
	

