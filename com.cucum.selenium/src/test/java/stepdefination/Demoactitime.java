package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoactitime {

	WebDriver driver;
 
	@Given("user opened the chrome browser")
	public void user_opened_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sf\\eclipse-workspace\\com.cucum.selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	    }
	@When("enter the url of Demoactitime")
	public void enter_the_url_of_demoactitime() {
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}
	@And("user is on loginpage")
	public void user_is_on_loginpage() {
		if(driver.getTitle().equals("actiTIME - Login"))
		{
			Assert.assertTrue(true);
			Reporter.log("loin page is displayed");
		}else {
			Reporter.log("login page is not displayed");
			Assert.assertFalse(false);
		}
	    
	}

	@When("^user Enter valid (.*) and (.*) in login and password textfields$")
	public void user_enter_valid_admin_and_manager_in_login_and_password_textfields(String UserName, String Password) {
		driver.findElement(By.id("username")).sendKeys(UserName);   
		driver.findElement(By.name("pwd")).sendKeys(Password);
	}


	@And("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		}

	@Then("user enter in actitime Homepage")
	public void user_enter_in_actitime_homepage() {
		if(driver.getTitle().equals("actiTIME -  Enter Time-Track"))
		{
			Assert.assertTrue(true);
			Reporter.log("Successful");
		}
			else
				Assert.assertFalse(false);
				Reporter.log("Fail");
		}






    
}

	


