package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports" ,
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = " @TECP-251, @TECP-241, @TECP-235, @TECP-238, @TECP-231"
)
public class CukesRunner {


}
