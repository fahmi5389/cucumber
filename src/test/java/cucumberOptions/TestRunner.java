package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "src/test/java/feature/",
		glue="stepDefinition", plugin= {"html:target/reportCucumber"}
		)


public class TestRunner {

}
