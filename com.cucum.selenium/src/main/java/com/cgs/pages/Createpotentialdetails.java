package com.cgs.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Factory;

import com.cgs.GenericLibrary.Basetest;
import com.cgs.GenericLibrary.Webdrivercommonlib;
import com.google.common.io.Files;

public class Createpotentialdetails {
	@FindBy(xpath = "//select[@name='property(Stage)']")private WebElement select;
	@FindBy(xpath = "//input[@name='property(Potential Name)']")private WebElement name;
	@FindBy(xpath = "//input[@id='Account Name']")private WebElement Accountt;
	@FindBy(xpath = "//input[@name='property(Closing Date)']")private WebElement closingdate;
	@FindBy(xpath = "//img[@title='Account Name Lookup']") private WebElement AccountNameLookUP;
	@FindBy(xpath = "//a[text()='QSpiders Banaswadi']") private WebElement SelectAccount;
	@FindBy(xpath = "//img[@title='Calendar']") private WebElement selectclosingdate;
	@FindBy(xpath = "(//input[@value='Save'])[2]") private WebElement save;
	@FindBy(xpath = "//a[text()='23']") private WebElement date;
	public Createpotentialdetails()
	{
	
		PageFactory.initElements(Basetest.driver, this);
	}
	public void NewPotential(String Potential, String Account) throws IOException  
			
	{
		name.sendKeys(Potential);
		//Accountt.sendKeys(Account);
		
		
		Webdrivercommonlib wlib = new Webdrivercommonlib();
		wlib.selectOptionByValue("50:Id. Decision Makers", select);
		AccountNameLookUP.click();
		wlib.GetWindowHandleClick("Zoho CRM - Account Name Lookup", SelectAccount);
		selectclosingdate.click();
		wlib.GetWindowHandleClick("Closing Date", date);
		save.click();
		wlib.getpagescreeenshot("C:\\Users\\Sf\\git\\repository\\cgs\\src\\test\\resources\\ScreenShots", "ss");
			
		
		
		
		
		
		
		
	}
    
}
