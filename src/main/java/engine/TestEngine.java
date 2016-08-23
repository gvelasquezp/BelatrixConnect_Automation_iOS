package engine;

/*JUNIT*/
/*import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue={"steps"}, 
					plugin={"html:target/testcases-execution-report"})

public class TestEngine {
    
}*/

/*TestNG*/

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "dev",
				 glue = "steps",
				 format = {"pretty"},
				 plugin={"html:target/testcases-execution-report"})

public class TestEngine extends AbstractTestNGCucumberTests {
	
}