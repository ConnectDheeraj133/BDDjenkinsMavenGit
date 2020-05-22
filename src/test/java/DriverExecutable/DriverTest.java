package DriverExecutable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", //the path of the feature files
		glue="stepDefinition" ,//the path of the step definition files
	monochrome = true, //display the console output in a proper readable format
		strict = true ,//it will check if any step is not defined in step definition file
	//	dryRun = true,//to check the mapping is proper between feature file and step def file
		tags = {"@smoke"},
			plugin= {"pretty","html:target/test-output", "json:target/cucucmber.json", "junit:target/cucumber.xml"}
		)





public class DriverTest {

}
