package motor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue={"steps"}, 
					plugin={"html:target/testcases-execution-report"})

public class TestEngine {
    
}