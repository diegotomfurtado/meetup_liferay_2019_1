package com.meetup.functional.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.meetup.functional.pages.HomePage;


/**
 * 
 * @author Diego Furtado
 * 
 */

public class HomeTest{

	@Before
	public void setUpAll_withoutBestPractives() throws InterruptedException {

		_driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		_driver.get("https://community.liferay.com/");
		
		Thread.sleep(3000);
	}

	@Test
	public void shouldClickOnProjectLinkFromHeader_validateIfTheRedirectIsRight() throws InterruptedException {

		_homePage.clickOnProjectLinkFromHeader_withoutCommonMethods();
		Assert.assertTrue(_homePage.getElementFromPage_withoutCommonMethods().contains("Our Projects"));
	}

	private final HomePage _homePage = new HomePage();
	
	private final WebDriver _driver = new ChromeDriver();
}
