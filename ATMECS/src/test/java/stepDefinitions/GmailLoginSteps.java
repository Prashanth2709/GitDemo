package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class GmailLoginSteps {

    WebDriver driver;
//    WebDriver emailInput = new ChromeDriver();
//    WebDriver nextButton = new ChromeDriver();
    
    @Given("^I open the Gmail login page$")
    public void open_gmail_login_page() {
        // Set path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prashanth.lingala\\eclipse-workspace\\ATMECS\\Drivers\\chromedriver1.exe");

        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Gmail login page
        driver.get("https://accounts.google.com/signin");
    }

    @When("^I enter the username and click next with (.+)$")
    public void i_enter_the_username_and_click_next_with(String username) {
        // Find username input field and enter the email
        WebElement emailInput = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
        emailInput.sendKeys(username);

        // Click on the Next button                           
        WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        nextButton.click();
      
        // Wait for a while to allow for page transition
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @When("^I enter the password and click next with (.+)$")
    public void i_enter_the_password_and_click_next_with(String password) {
        // Wait for the password field to be visible
        WebElement passwordInput = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
       passwordInput.sendKeys(password);

        // Click the Next button
        WebElement nextButton = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]"));
        nextButton.click();

        // Wait for page transition
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Then("^I should see the Gmail inbox$")
    public void should_see_inbox() {
        // Verify that the inbox is visible by checking the presence of inbox elements
        boolean inboxPresent = driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).isDisplayed();

        if (inboxPresent) {
            System.out.println("Successfully logged into Gmail!");
        } else {
            System.out.println("Failed to log in.");
        }

        // Close the browser
        driver.quit();
    }
}
