package com.meetup.functional.pages;

import org.openqa.selenium.WebDriver;

public class BasePages {
	protected WebDriver _driver;

	public BasePages(WebDriver _driver) {
		this._driver = _driver;
	}
}
