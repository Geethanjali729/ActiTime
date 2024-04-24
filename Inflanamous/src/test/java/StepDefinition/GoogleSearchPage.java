package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPage {
	WebDriver driver;
	@Given("User should be present in google webpage")
	public void user_should_be_present_in_google_webpage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
	   }

	@When("the user enters qspiders basavanagudi")
	public void the_user_enters_qspiders_basavanagudi() {
		driver.findElement(By.name("q")).sendKeys("Qspiders", Keys.ENTER);
	   }

	@Then("Search page should be displayed")
	public void search_page_should_be_displayed() {
System.out.println(driver.getTitle());	    }
}
