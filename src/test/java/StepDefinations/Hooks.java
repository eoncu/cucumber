package StepDefinations;

import io.cucumber.java.*;

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
        DriverSource.INSTANCE.getDriver().quit();
    }

}

