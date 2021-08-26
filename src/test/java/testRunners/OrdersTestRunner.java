package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Avinav\\eclipse-workspace\\CucumberPractices\\src\\test\\resources\\AppFeatures\\Order.feature", //location of feature file
		glue= {"stepDefinitions"}, //path of step definition file
		//format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junt_xml/cucumber.xml"}, //generate different types of reporting formats
		dryRun = true, //check mapping between feature file and step def file
		//monochrome = true, //display console o/p in a readable format
		//strict = true //Fails execution if there are any pending or undefined steps
		//tags = {"~@SmokeTest", "~@RegressionTest","~@End2end"} //only execute scenarios under these tags in the feature file
		publish = true
		)
public class OrdersTestRunner {

}
