package StepDefinations;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    @BeforeAll
    public static void initTest() throws InterruptedException {
        System.out.println("************ Begin Test");
        DriverSource.INSTANCE.getDriver();
        //Thread.sleep(2000);
    }
    @AfterAll
    public static void endTest() throws InterruptedException {
        System.out.println("************ End Test");
        //Thread.sleep(2000);
        DriverSource.INSTANCE.getDriver().manage().window().minimize();
        DriverSource.INSTANCE.getDriver().quit();
    }

}

