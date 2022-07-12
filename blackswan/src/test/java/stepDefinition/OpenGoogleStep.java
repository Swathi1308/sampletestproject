package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStep {

	WebDriver driver;
	@Given("user is entering google.com")
	public void user_is_entering_google_com() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() throws Exception {
	   driver.findElement(By.name("q")).click();
	   Thread.sleep(5000);
	}

	@When("types the search term as {string}")
	public void types_the_search_term_as(String cake) throws Exception {
		driver.findElement(By.name("q")).sendKeys(cake);
		Thread.sleep(5000);
	}

	@Then("the user should see the search results for Krishna")
	public void the_user_should_see_the_search_results_for_krishna() throws Exception {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		boolean status = driver.findElement(By.partialLinkText("krish")).isDisplayed();
		if(status) {
			System.out.println("Successful");
			Thread.sleep(5000);
			driver.close();
		}
	}
}
