package com.meetup.functional.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Diego Furtado
 * 
 */

public class HomePage {

	public void clickOnProjectLinkFromHeader_withoutCommonMethods() throws InterruptedException {
		
		Thread.sleep(3000);
		_driver.findElement(projectLinkLocator).click();
	}
	
	public String getElementFromPage_withoutCommonMethods() throws InterruptedException {
		
		Thread.sleep(3000);
		return _driver.findElement(projectHomePageLocator).getText();
	}
	
	private final WebDriver _driver = new ChromeDriver();
	
	public static final By projectLinkLocator = xpath("//*[@class='navbar-item']//span[contains(text(),'Project')]");
	public static final By projectHomePageLocator = xpath("//*[@class='projects-title' and text()='Our Projects']");
}
