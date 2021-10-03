package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;

public class Newleadpage {
	@FindBy(xpath = "//input[@value='New Lead']") private WebElement newLead;
	public Newleadpage ()
	{
		PageFactory.initElements(Basetest.driver, this);
	}
	
	public WebElement getNewLead() {
		return newLead;
	}
	public void setNewLead(WebElement newLead) {
		this.newLead = newLead;
	}
	public void ClicknewLead()
	{
		newLead.click();
	}

}
