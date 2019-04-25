package com.meetup.functional.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Diego Furtado
 * 
 */

public class HomePage extends BasePages{
	
	public HomePage(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnProjectLinkFromHeader_withoutCommonMethods() throws InterruptedException {
		
		Thread.sleep(3000);
		_driver.findElement(_projectLinkLocator).click();
	}
	
	public String getElementFromPage_withoutCommonMethods() throws InterruptedException {
		
		Thread.sleep(3000);
		return _driver.findElement(_projectHomePageLocator).getText();
	}
	
	public static final By _projectLinkLocator = xpath("//*[@class='navbar-item']//span[contains(text(),'Project')]");
	public static final By _projectHomePageLocator = xpath("//*[@class='projects-title' and text()='Our Projects']");
}
