package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/GoogleSearch.feature",glue={"stepDefinitions"},monochrome=true,
plugin={"pretty","html:target/HtmlReports/htmlReports.html"})
public class TestRunner {

}
