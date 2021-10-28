package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.AddToCardPageLocators;

public class AddToCardPage {

	 WebDriver driver = null;
     
     public AddToCardPage(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getAddToCard()
     {
  	   return driver.findElement(AddToCardPageLocators.addToCard);
     }
	
     public WebElement getTitleAfterAdding()
     {
  	   return driver.findElement(AddToCardPageLocators.titleAfterAdding);
     }
     
     public WebElement getShopingCard()
     {
  	   return driver.findElement(AddToCardPageLocators.shopingCart);
     }
     
     public WebElement getViewCart()
     {
  	   return driver.findElement(AddToCardPageLocators.viewCart);
     }
  
}
