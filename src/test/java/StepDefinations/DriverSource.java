package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*public class DriverSource {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            driver=new ChromeDriver();
        }
        return driver;
    }
}*/
public enum DriverSource  {

    //only one instance
    INSTANCE;
  ChromeOptions options = new ChromeOptions();
    private  WebDriver driver;

    public  WebDriver getDriver(){
        if (driver == null){
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
            //options.addArguments("headless");
        }
        return driver;
    }
}
