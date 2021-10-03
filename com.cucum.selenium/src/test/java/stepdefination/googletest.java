package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 

public class googletest {
//WebDriver driver;
	Google gg=new Google();


@Given("Browser is opened")
public void browser_is_opened() {
	gg.browser();

}
    
@Given("User is on Google Page")
public void user_is_on_google_page() {
	gg.validation();
}

@When("User enters text in searchfield")
public void user_enters_text_in_searchfield() {
gg.search();
}

@When("User clicks on searchButton")
public void user_clicks_on_search_button() {
	gg.enter();
}

@Then("Search Results Page should be displayed")
public void search_results_page_should_be_displayed() {
   gg.verification();
}
/*
 * @And("User is on Google Page") public void user_is_on_google_page() {
 * driver.get("https://www.google.com"); }
 * 
 * @When("User enters text in searchfield") public void
 * user_enters_text_in_searchfield() {
 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 * 
 * }
 * 
 * @And("User clicks on searchButton") public void
 * user_clicks_on_search_button() {
 * 
 * }
 * 
 * @Then("Search Results Page should be displayed")
 * 
 * public void search_results_page_should_be_displayed() throws
 * InterruptedException {
 * 
 * Thread.sleep(1000);
 * 
 * if(driver.getTitle().equals("Baby-google search")) { Assert.assertTrue(true);
 * Reporter.log("Successfully navigated to the page"); } else {
 * Reporter.log("Successfully not navigated to the page");
 * Assert.assertFalse(false); }
 * 
 * }
 * 
 */

    

}
