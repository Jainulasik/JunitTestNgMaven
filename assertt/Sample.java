package org.assertt;

import static org.testng.Assert.assertEquals;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseClass {

	public static BaseClass base = new BaseClass();

	@Test(priority = -100)
	public static void OrangehrmLogin() {

		base.browserLaunch("chrome");
		base.urlLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Maximizee();
		implicitwait(2);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123" + Keys.ENTER);

		System.out.println("Orangehrm -Successfully launched");

		String expectedurl = ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

		String actualurl = driver.getCurrentUrl();

		assertEquals(actualurl, expectedurl);
	}

	@Test(priority = 100)
	public static void Adminn() {

		implicitwait(2);
		driver.findElement(By.xpath("//*[text()='Admin']")).click();

		String Expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String Acturl = driver.getCurrentUrl();
		assertEquals(Expurl, Acturl);
	}
}




//SoftAssert sa = new SoftAssert();
//
//sa.assertEquals(actualurl, expectedurl);
//
//}
