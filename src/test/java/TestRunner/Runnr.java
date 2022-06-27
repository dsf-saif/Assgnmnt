package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
	features=("src/test/java/feat"),
	glue={"StepDefntn","Hooks"},
		plugin={"pretty"},
		monochrome=true,
		dryRun=false )

public class Runnr
{
	
	
}
