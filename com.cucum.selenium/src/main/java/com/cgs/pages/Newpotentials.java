package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newpotentials {
	@FindBy(xpath = "//input[@value='New Potential']")private WebElement newpotntials;
	public Newpotentials()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	
	public WebElement getNewpotntials() {
		return newpotntials;
	}

	public void setNewpotntials(WebElement newpotntials) {
		this.newpotntials = newpotntials;
	}

	public void clicknewpotentials()
	{
		newpotntials.click();
	}
	


}
