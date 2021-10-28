package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class AddToCardPageLocators {
	

	public static By addToCard = By.id("product-addtocart-button");
	
	public static By titleAfterAdding = By.xpath("//div[contains(text(), 'You added')]");
	
	public static By shopingCart = By.cssSelector("a.action.showcart");
	
	public static By viewCart = By.cssSelector("a.action.viewcart");
}
