package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class SelectProductPageLocators {

	public static By getListOfBooks = By.cssSelector("ol.products.list.items.product-items a.product-item-link");
	
	public static By booksHeading = By.cssSelector("div.block-title.filter-title");
}
