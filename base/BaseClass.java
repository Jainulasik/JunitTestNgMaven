package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;


	public  void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		

		}
	}

	
	public void urlLaunch(String url) {

		driver.get(url);

	}
	
	public static void Maximizee() {
		driver.manage().window().maximize();
	}

	public void sendText(WebElement keys,String user) {

		keys.sendKeys(user);

	}

	public void buttonClick(WebElement button) {
		button.click();

	}

	public void screenCapture(String capture) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File a = ts.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\" + capture + ".png");
		FileUtils.copyFile(a, b);


	}
	
	
	public static void Robot(int value ) throws AWTException {
		Robot r = new Robot();
		r.keyPress(value);
		r.keyRelease(value);
	}


	public void alert(String type) {
		Alert alert = driver.switchTo().alert();

		switch (type) {
		case "Accept":
			alert.accept();
			break;

		case "Dismiss":
			alert.dismiss();
			break;

		default:
			break;
		}
	}
	
	
	public static String selectbydropdown(WebElement element , String option , String value) {
		Select se = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			int indexvalue = Integer.parseInt(value);
			se.selectByIndex(indexvalue);

		}
		else if (option.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("text")) {
			se.selectByVisibleText(value);
		}
		return option;

	}


	public void ActionMethod(WebElement contextclik) {
		Actions ac = new Actions(driver);
		ac.contextClick(contextclik).perform();
		
//		ac.moveToElement(mousehover).perform();
//		ac.click(clickk);

	}



	public void dropDowns(WebElement element,int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
		
	}



	public void alertSetup(WebElement element) {
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();

	}
	public void clear(WebElement delete) {
     
		delete.clear();

	}
	
	public static void sleep(int sec) throws InterruptedException {
		
		Thread.sleep(sec);
	}




	public String readExcel(int rownum,int cellnum) throws IOException {

		File f = new File("D:\\Adactin.xlsx"); 
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);

		org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();		

		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;


		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				sdf.format(dateCellValue);
			}


			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				String string = valueOf.toString();
			}
			break;


		default:
			System.out.println("undefined format");
			break;
		}

		return value;
	}


	public static void Actions(WebElement element , String value) {

		Actions ac = new Actions(driver);
		if (value == "click") {
			ac.click(element).build().perform();

		}
		else if ( value == "contextclick") {
			ac.contextClick(element).build().perform();

		}
		else if (value == "doubleclick") {
			ac.doubleClick(element).build().perform();
		}
		else if (value == "movetoelement") {
			ac.moveToElement(element).build().perform();
		}
	}
	public static void windowhandles() {

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String a : windowHandles) {
			System.out.println(a);
			driver.switchTo().window(a);
			String title = driver.getTitle();
			System.out.println(title);

		}




	}
	
	public static void quitbrowser() {
		driver.quit();
	}


	public static void implicitwait(int duration) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}
}










