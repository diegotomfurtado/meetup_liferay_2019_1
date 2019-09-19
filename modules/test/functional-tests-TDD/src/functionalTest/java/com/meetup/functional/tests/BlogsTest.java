package com.meetup.functional.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.liferay.gs.testFramework.FunctionalTest;
import com.liferay.gs.testFramework.core.SeleniumReadPropertyKeys;
import com.meetup.functional.pages.BlogPage;

public class BlogsTest extends FunctionalTest{

	@Before
	public void setUpAll_withBestPractives() {

		getWebDriver().manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(), TimeUnit.SECONDS);
		getWebDriver().get(SeleniumReadPropertyKeys.getUrlToHome());
	}
	
	@Test
	public void shouldClickOnProjectLinkFromHeader_validateIfTheRedirectIsRight(){

		_blogPage.clickOnProjectLinkFromHeader_withCommonMethods();
		Assert.assertTrue(_blogPage.getElementFromPage_withCommonMethods().contains("Blogs"));
	}

	BlogPage _blogPage = new BlogPage();
}
