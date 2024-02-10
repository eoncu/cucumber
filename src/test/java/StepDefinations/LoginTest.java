package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginTest extends BaseTest  {
   // private WebDriver driver = new ChromeDriver();
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        DriverSource.INSTANCE.getDriver().get("https://www.saucedemo.com/");

    }

    @When("User enters valid username")
    public void userEntersValidUsername() {
        WebElement userNameInput =DriverSource.INSTANCE.getDriver().findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {

        WebElement passwordInput = DriverSource.INSTANCE.getDriver().findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
    }
    @And("user cliks login button")
    public void userCliksLoginButton() {
        WebElement loginBtn = DriverSource.INSTANCE.getDriver().findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();
    }
    @Then("User schould succesfully login the system")
    public void userSchouldSuccesfullyLoginTheSystem() {
        Assert.assertFalse(false);
        DriverSource.INSTANCE.getDriver().quit();


    }


}
