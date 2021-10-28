package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.ShopingCardPageLocators;

public class ShopingCardPage {

	 WebDriver driver = null;
     
     public ShopingCardPage(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getSummuryTitle()
     {
  	   return driver.findElement(ShopingCardPageLocators.summury);
     }
}
