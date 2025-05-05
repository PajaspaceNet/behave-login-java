package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("I enter valid username and password")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("login")).click();
    }

    @Then("I should see the dashboard")
    public void verifyDashboard() {
        assert driver.getCurrentUrl().contains("dashboard");
        driver.quit();
    }
}
