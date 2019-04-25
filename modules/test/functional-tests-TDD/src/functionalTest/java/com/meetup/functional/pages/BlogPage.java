package com.meetup.functional.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.gs.testFramework.FunctionalTest;
import com.meetup.functional.utils.CommonMethods;

public class BlogPage extends FunctionalTest{
	
	public void clickOnProjectLinkFromHeader_withCommonMethods(){

		_commonMethods.clickOnTheElement(_projectLinkLocator);
	}

	public String getElementFromPage_withCommonMethods(){

		return _commonMethods.getTextFromPage(_getTextProjectFromHomePageLocator);
	}

	public static final By _projectLinkLocator = xpath("//*[@class='navbar-item']//span[contains(text(),'Blogs')]");
	public static final By _getTextProjectFromHomePageLocator = xpath("//*[@class='blog-title' and text()='Blogs']");

	CommonMethods _commonMethods = new CommonMethods(getWebDriver());
}
