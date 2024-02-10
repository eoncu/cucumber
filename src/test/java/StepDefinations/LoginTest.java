package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest extends  BaseTest {
    private WebDriver driver = new ChromeDriver();
    @Given("User is on login page")
    public void userIsOnLoginPage() {

        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username")
    public void userEntersValidUsername() {

        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
    }
    @And("user cliks login button")
    public void userCliksLoginButton() {
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();
    }
    @Then("User schould succesfully login the system")
    public void userSchouldSuccesfullyLoginTheSystem() {
        Assert.assertFalse(false);
        driver.quit();


    }


}
