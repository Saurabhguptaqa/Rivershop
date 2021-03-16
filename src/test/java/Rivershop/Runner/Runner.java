package Rivershop.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		plugin="pretty",
		features="F:\\Maven_Project\\Rivershop\\src\\test\\resources\\CucumerPages",
		tags="@SmokeTest",
		glue="Rivershop.TestCases",
		monochrome=true
)
public class Runner {

}
