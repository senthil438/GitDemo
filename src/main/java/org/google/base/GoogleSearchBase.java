package org.google.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelData;

public class GoogleSearchBase {
	
	
protected RemoteWebDriver driver = null;
	
	String URL = "https://www.google.co.in/";
	
	@DataProvider(name = "searchData")
	public Object[][] dataProvider() {
		
		Object[][] searchdata = ReadExcelData.readExcelData("TC001");
		return searchdata;
	}
	
	@BeforeMethod
	public void openApp(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
	}
}
