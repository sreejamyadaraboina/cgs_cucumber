package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newaccount {
	@FindBy(xpath = "//input[@value='New Account']")private WebElement newacnt;
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public WebElement getNewacnt() {
		return newacnt;
	}
	public void setNewacnt(WebElement newacnt) {
		this.newacnt = newacnt;
	}
	public void CLICKNEWACCOUNT()
	{
		newacnt.click();
	}
}


