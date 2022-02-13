package org.google.pages;

import org.google.base.GoogleSearchBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends GoogleSearchBase {
	
	public GoogleSearchPage(RemoteWebDriver driver) {
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	WebElement textbox_search;
	@FindBy(name = "btnK")
	WebElement search_button;
	
	/*By textbox_search = By.name("q");
	By search_button = By.name("btnK");*/
	
	
	public GoogleSearchPage GoogleSearchPageActions(String text){
		
		
		
		textbox_search.sendKeys(text);		
		search_button.click();
		
		/*driver.findElement(textbox_search).sendKeys(text);
		//driver.findElement(search_button).sendKeys(Keys.RETURN);
		driver.findElement(search_button).click();*/
		return this;
		
	}
	

}
