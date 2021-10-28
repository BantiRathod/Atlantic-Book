package com.mindtree.pageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.SelectProductPageLocators;

public class SelectProductPage {
		
	       WebDriver driver = null;
	       
	       public SelectProductPage(WebDriver driver)
	       {
	    	   this.driver = driver;
	       }
	       
	       public List<WebElement> getSelectProduct()
	       {
	         return driver.findElements(SelectProductPageLocators.getListOfBooks);
	       }
	       
	       public WebElement getCommonHeading()
	       {
	         return driver.findElement(SelectProductPageLocators.booksHeading);
	       }
	       
}
