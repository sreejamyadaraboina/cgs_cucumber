package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Createcampaigndetails {
	@FindBy(xpath = "//input[@name='property(Campaign Name)']")private WebElement campgn;
	@FindBy(xpath = "//input[@value='Save']")private WebElement savebtn;
public Createcampaigndetails()
{
PageFactory.initElements(Basetest.driver, this);
}
	
public void clickcampaigndetails(String Campaign)
		{
			campgn.sendKeys(Campaign);
			savebtn.click();
		}
		
	}

