package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newcampaign {
	@FindBy(xpath = "//input[@value='New Campaign']")private WebElement newcamgn;
	public Newcampaign() {
		PageFactory.initElements(Basetest.driver, this);
	}
	public WebElement getNewcamgn() {
		return newcamgn;
	}
	public void setNewcamgn(WebElement newcamgn) {
		this.newcamgn = newcamgn;
	}
	public void clicknewcampaign()
	{
		newcamgn.click();
	}

}
