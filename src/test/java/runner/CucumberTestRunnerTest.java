package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features"},glue = {"StepDefinations.LoginTest"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
