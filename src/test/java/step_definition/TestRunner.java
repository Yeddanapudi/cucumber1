package step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features="src/test/resources/features",glue={"step_definition"},
monochrome=true,
plugin={"pretty","HTML:target/HTMLReports"}
			)
public class TestRunner {

}
