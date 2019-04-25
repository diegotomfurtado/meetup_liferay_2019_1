package com.meetup.functional.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
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
	}
	
	@After
	public void stop_withoutBestPractives() throws InterruptedException {

		_driver.close();
	}

	@Test
	public void shouldClickOnProjectLinkFromHeader_validateIfTheRedirectIsRight() throws InterruptedException {

		new HomePage(_driver).clickOnProjectLinkFromHeader_withoutCommonMethods();
		Assert.assertTrue(new HomePage(_driver).getElementFromPage_withoutCommonMethods().contains("Our Projects"));
	}

	private final WebDriver _driver = new ChromeDriver();
}
