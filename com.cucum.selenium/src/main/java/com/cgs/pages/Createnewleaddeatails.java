package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Createnewleaddeatails {
	
@FindBy(xpath = "//input[@name='property(Company)']")private WebElement companytb;
@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement lastnmetb;
@FindBy(xpath = "//input[@value='Save']")private WebElement savebtn;

	public Createnewleaddeatails()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
public void createpagewithmandatorydetails(String companyName,String ln)
{
	companytb.sendKeys(companyName);
	lastnmetb.sendKeys(ln);
	savebtn.click();
}
}