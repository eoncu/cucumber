package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features"},glue = {"StepDefinations"} ,  tags = "")
public class CucumberTestRunnerTest extends AbstractTestNGCucumberTests {

}
