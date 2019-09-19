package com.meetup.functional.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liferay.gs.testFramework.FunctionalTest;
import com.liferay.gs.testFramework.utils.SeleniumWaitMethods;

/**
 * 
 * @author Diego Furtado
 * 
 */

public class CommonMethods extends FunctionalTest {

	public void clickOnTheElement(By locator) {

		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);
		_webDriver.findElement(locator).click();
	}

	public void input(By locator, String text) {

		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated, ExpectedConditions::elementToBeClickable);
		getWebDriver().findElement(locator).clear();
		getWebDriver().findElement(locator).sendKeys(text);
	}

	public String getTextFromPage(By locator) {

		SeleniumWaitMethods.findElementWithWaitDriver(getWebDriver(), locator,
				ExpectedConditions::visibilityOfElementLocated);
		
		String getText = getWebDriver().findElement(locator).getText();
		return getText;
	}

	public void switchToNewWindowPage() throws InterruptedException {

		for (String winHandle : getWebDriver().getWindowHandles()) {

			SeleniumWaitMethods.waitMediumTime();
			getWebDriver().switchTo().window(winHandle);
		}
	}

	public void returnToPreviousPage() {

		getWebDriver().navigate().back();
	}

	public String getCurrentURL() {

		return getWebDriver().getCurrentUrl();
	}

	public void returnToPreviousWindowns() throws InterruptedException {

		switchToNewWindowPage();
	}

	public CommonMethods(WebDriver webDriver) {

		_webDriver = webDriver;
	}

	private WebDriver _webDriver;
}