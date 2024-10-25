package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	

@Given("User is on login page")
public void user_is_on_login_page() {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashanth.lingala\\eclipse-workspace\\ATMECS\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    
    // Print the title of the page
    System.out.println("Page title is: " + driver.getTitle());
    
    // Close the browser
    driver.quit();

}
@When("User login into application")
public void user_login_into_application() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User login into application");
}
@Then("Home page is displayed")
public void home_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Home page is displayed");
}
@Then("Product are displayed")
public void product_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Product are displayed");
}

}
