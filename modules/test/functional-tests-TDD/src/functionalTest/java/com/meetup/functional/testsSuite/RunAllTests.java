package com.meetup.functional.testsSuite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.liferay.gs.testFramework.core.ConcurrentSuite;
import com.liferay.gs.testFramework.driver.WebDriverManager;
import com.meetup.functional.tests.BlogsTest;
import com.meetup.functional.tests.HomeTest;

/**
 * 
 * @author Diego Furtado
 * 
 */

@RunWith(ConcurrentSuite.class)
@SuiteClasses({ 
	HomeTest.class ,
	BlogsTest.class
})

public class RunAllTests {

	@AfterClass
	public static void afterClass() {
		_webDriverManager.quitAll();
	}

	private static WebDriverManager _webDriverManager = new WebDriverManager();

}
