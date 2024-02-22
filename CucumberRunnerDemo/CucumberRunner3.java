 package CucumberRunnerDemo;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "feature",glue ="CucumberStepDef")
public class CucumberRunner3 
{
	

}
