package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.SignInPageLocators;


public class SignInPage {

	       WebDriver driver = null;
	       
	       public SignInPage(WebDriver driver)
	       {
	    	   this.driver = driver;
	       }
	       
	       
	       public WebElement getUserName()
	       {
	    	   return driver.findElement(SignInPageLocators.email);
	       }
	       
	       public WebElement getPassword()
	       {
	    	   return driver.findElement(SignInPageLocators.password);
	       }
	       
	       public WebElement getSignInSmmitButton()
	       {
	    	   return driver.findElement(SignInPageLocators.signInSummitButton);
	       }
	       
}

