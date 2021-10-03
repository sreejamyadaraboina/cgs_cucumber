package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newforecast {
	@FindBy(xpath = "//input[@value='New Forecast']")private WebElement forecast;
	public Newforecast()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public WebElement getForecast() {
		return forecast;
	}
	public void setForecast(WebElement forecast) {
		this.forecast = forecast;
	}
	public void clicknewforecast()
	{
		forecast.click();
	}
	

}
