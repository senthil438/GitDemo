package org.google.tests;

import org.google.base.GoogleSearchBase;
import org.google.pages.GoogleSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC001 extends GoogleSearchBase{
	
	
	
	@Test(dataProvider = "searchData")
	public void GoogleSearchTest(String[] data){
		
		new GoogleSearchPage(driver).GoogleSearchPageActions(data[0]);
		
		
	}
}
