package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/Features", //feature file
			glue = "StepDefinitions",   //Step definition
			monochrome=true,
			plugin= {"pretty","json:target/jsonReport/cucu.json"},
			dryRun=false
			
			
			
			)
	
	public class TestRunner {
	
	
	
	
}
