package stepdefination;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class Google {
	WebDriver driver;
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sf\\eclipse-workspace\\com.cucum.selenium\\src\\main\\resources\\drivers\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 //driver.close();
	}
	
	public void validation() {
	driver.findElement(By.xpath("//*[@class='lnXdpd']"));
	
	}
	
	public void search() {
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("array");
	}
	
	public void enter() {
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
	}

	public void verification() {
		if(driver.getTitle().equals("array - Google Search")) {
			Assert.assertTrue(true);
			Reporter.log("Successful");
		}else {
			Assert.assertFalse(false);
			Reporter.log("Failed");
		}
		driver.close();
	}
}
