package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.SearchBoxPageLocators;

public class SearchBoxPage {
		
	       WebDriver driver = null;
	       
	       public SearchBoxPage(WebDriver driver)
	       {
	    	   this.driver = driver;
	       }
	       
	       public WebElement getSearchBox()
	       {
	    	   return driver.findElement(SearchBoxPageLocators.searchBox);
	       }
	      
	       public WebElement getMyAccount()
	       {
	    	   return driver.findElement(SearchBoxPageLocators.myAcc);
	       }
}
