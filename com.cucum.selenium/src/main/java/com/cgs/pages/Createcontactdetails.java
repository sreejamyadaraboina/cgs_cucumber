package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Createcontactdetails  {
	@FindBy(xpath = "//input[@name='property(Last Name)']")private WebElement ln;
	@FindBy(xpath = "//input[@value='Save']")private WebElement savebtn;
	
		public Createcontactdetails()
		{
			PageFactory.initElements(Basetest.driver, this);
	}
		public void createcontctdetails(String lastname)
		{
			ln.sendKeys(lastname);
			savebtn.click();
		}
		
	
	
	

}
