package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.GenericLibrary.Basetest;
import com.cgs.GenericLibrary.Webdrivercommonlib;

public class GetWindow extends Basetest
{
	@FindBy(xpath=("//a[text()='accenture whitfeild']")) private WebElement Accenture;
	@FindBy(xpath = "//select[@name='property(Stage)']")private WebElement select;
	@FindBy(xpath = "//a[text()='23']") private WebElement date;
public GetWindow()
{
	PageFactory.initElements(Basetest.driver, this);
}
 public  void accentureclick()
 {
	 Webdrivercommonlib wlb=new Webdrivercommonlib();
	wlb.selectOptionByValue("50:Id. Decision Makers", select);
	wlb.GetWindowHandleClick("Zoho CRM - Account Name Lookup", Accenture);
	wlb.GetWindowHandleClick("Closing Date", date);
	
	
 }
}
	


