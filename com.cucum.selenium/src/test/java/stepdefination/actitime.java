package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class actitime {
	WebDriver driver;
	
	@Given("chrome browser is opened")
	public void chrome_browser_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sf\\eclipse-workspace\\com.cucum.selenium\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	    
	}

	@Given("user is in Actitime login page")
	public void user_is_in_actitime_login_page() {
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@When("^user enters (.*) and (.*) in login and password feilds$")
	public void user_enters_admin_and_manager_in_login_and_password_feilds(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);   
		driver.findElement(By.name("pwd")).sendKeys(password);
	}
	

	@When("user click on loginButton")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
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


