package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Createaccountdetails {
	@FindBy(xpath = "//input[@name='property(Account Name)']")private WebElement acntname;
	@FindBy(xpath = "//input[@value='Save']")private WebElement savebtn;
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public void Accountdetails(String Accountname)
	{
		acntname.sendKeys(Accountname);
		savebtn.click();
	}

}
