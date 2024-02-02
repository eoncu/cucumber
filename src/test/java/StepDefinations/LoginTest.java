import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("1");
    }

    @When("User enters valid username")
    public void userEntersValidUsername() {
        System.out.println("2");
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        System.out.println("3");
    }

    @Then("User schould succesfully login the system")
    public void userSchouldSuccesfullyLoginTheSystem() {
        System.out.println("4");
    }
}
/*
 public void firstTest(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
    userNameInput.sendKeys("standard_user");
    WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
    passwordInput.sendKeys("secret_sauce");
    WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
    loginBtn.click();
    driver.quit();

    }
 */