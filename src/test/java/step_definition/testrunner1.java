package step_definition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"step_definition"},
monochrome=true,
plugin={"pretty","junit:target/HtmlReports/report.xml",
"html:target/HtmlReports/report.html"		
}
			)


public class testrunner1 {

}
