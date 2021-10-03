package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newcontact {
	@FindBy(xpath = "//input[@value='New Contact']")private WebElement newcnct;
	
	public Newcontact()
	{
		PageFactory.initElements(Basetest.driver, this);
	}

	public WebElement getNewcnct() {
		return newcnct;
	}

	public void setNewcnct(WebElement newcnct) {
		this.newcnct = newcnct;
	}
	public void clicknewcnct()
	{
		newcnct.click();
	}

}
