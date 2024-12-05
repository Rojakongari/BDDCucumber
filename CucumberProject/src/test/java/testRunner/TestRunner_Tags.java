package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags/Tags.feature", 
glue= {"StepDefinitions"},
tags = "@smoke and @regression")
//tags = {"@smoke or @regression"}
//tags = {"@smoke and @regression"}
//tags = {"(@smoke or @regression) and @important"}
//tags = {"@regression and not @smoke"}
//tags = {"(@smoke or @regression) and not @important"}

public class TestRunner_Tags {

}
