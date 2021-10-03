package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.cgs.GenericLibrary.Basetest;
import com.cgs.GenericLibrary.Filelib;
import com.cgs.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Potential extends Basetest {
	@Given("User is on Login Module")
	public void user_is_on_login_module() throws Throwable {
		 Basetest bt = new Basetest();
		 bt.openbrowser();
		Loginpage lp = new Loginpage();
		Filelib flb = new Filelib();
		lp.logintoAPP(flb.getpropdata("username",PROP_PATH ),flb.getpropdata("password", PROP_PATH));
		}

	@When("User is on Home Module")
	public void user_is_on_home_module() {
		
		if(driver.getTitle().equals("Zoho CRM - Home Page"))
		{
		Assert.assertTrue(true);
		Reporter.log("Successful");
	}
	    else
	   Assert. assertFalse(false);
			Reporter.log("Failed");
	
	}  
	

	@When("User clicks Potential Tab")
	public void user_clicks_potential_tab() {
		driver.findElement(By.xpath("//a[text()='Potentials']")).click();
	    
	}

	@Then("User Clicks NewPotential Tab")
	public void user_clicks_new_potential_tab() {
		driver.findElement(By.xpath("//input[@value='New Potential']")).click();
	    
	}

	@Then("user Enters Account name")
	public void user_enters_account_name() {
		driver.findElement(By.xpath("//img[@title='Account Name Lookup']")).click();
		driver.findElement(By.xpath("//img[@title='Calendar']")) .click();
	GetWindow GW = new GetWindow();
	GW.accentureclick();
		}

	@Given("^user enters (.*) with Valid details$")
	public void user_enters_sreeja_with_valid_details(String potentialsname) {
		driver.findElement(By.xpath("//input[@name='property(Potential Name)']")).sendKeys(potentialsname);
		
	    
	}

	@When("user clicks on save Button")
	public void user_clicks_on_save_button() {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	    
	}


}
