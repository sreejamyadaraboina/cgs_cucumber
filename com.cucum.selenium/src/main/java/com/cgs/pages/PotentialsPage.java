package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class PotentialsPage {
	@FindBy(xpath ="//input[@value='New Potential']" )private WebElement newpotential;
	public PotentialsPage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	public void clicknewpotentialbtn()
	{
		newpotential.click();
	}
}
