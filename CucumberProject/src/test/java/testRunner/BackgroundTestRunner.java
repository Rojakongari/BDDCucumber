package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features="src/test/resources/Feature/BackgroundDemo/BackgroundDemo.feature", glue= {"StepsforBackground"},
=======
@CucumberOptions(features="src/test/resources/Feature/BackgroundDemo/BackgroundDemo.feature", glue= {"StepsForBackground"},
>>>>>>> refs/remotes/origin/master
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/htmlReports.html"})
		
public class BackgroundTestRunner {

}
