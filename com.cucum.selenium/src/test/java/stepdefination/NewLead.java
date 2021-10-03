package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.cgs.GenericLibrary.Basetest;
import com.cgs.GenericLibrary.Filelib;

import com.cgs.GenericLibrary.Webdrivercommonlib;
import com.cgs.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLead extends Basetest {
	
	
	@Given("Chrome Browser is opened")
	public void chrome_browser_is_opened() throws Throwable {
		Basetest bt = new Basetest();
		bt.openbrowser();
		
	    
	}
	@Then("user is on Loginpage")
	public void user_is_on_loginpage() throws Throwable {
		 Filelib flib = new  Filelib();
		 Webdrivercommonlib wlib = new Webdrivercommonlib();
		wlib.verify(wlib.getpagetitle(), flib.getpropdata("loginTitle",PROP_PATH ),"logintitle");
		
	    
	}

	@When("user click on Login button")
	public void user_click_on_login_button() throws Throwable {
		Loginpage lp = new Loginpage();
		Filelib lb = new Filelib ();
		 lp.logintoAPP(lb.getpropdata("username", PROP_PATH),lb.getpropdata("password", PROP_PATH));
	    
	}

	@When("User is on Homepage")
	public void user_is_on_homepage() {
		
		if(driver.getTitle().equals("Zoho CRM - Home Page"))
		{
			Assert.assertTrue(true);
			Reporter.log("Successful");
		}
			else
				Assert.assertFalse(false);
				Reporter.log("Fail");
		}

	

	@Then("user click on leadtab")
	public void user_click_on_leadtab() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
	}

	@Then("user click on newleadbtn")
	public void user_click_on_newleadbtn() {
		 driver.findElement(By.xpath("//input[@value='New Lead']")).click();
	    
	}

	@Then("^User enters (.*) and (.*) in login and Password fields$")
	public void user_enters_wipro_and_baby_in_login_and_password_fields(String company,String Lastname) {
		driver.findElement(By.name("property(Company)")).sendKeys(company);   
		driver.findElement(By.name("property(Last Name)")).sendKeys(Lastname);
	    
	}

	@When("user click on savebtn")
	public void user_click_on_savebtn() {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	    
	}


}
