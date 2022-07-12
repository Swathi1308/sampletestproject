package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Sample.feature",glue = "stepDefinition",stepNotifications = true,dryRun = false,monochrome = true)
public class RunnerFile {

	
}
