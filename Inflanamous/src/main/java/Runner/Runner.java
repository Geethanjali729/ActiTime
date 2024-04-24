package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "FetureFile/GoogleSearchPage.feature", glue="StepDefinition")
public class Runner extends AbstractTestNGCucumberTests {
	

}
