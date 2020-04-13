package com.mobile.app.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/testReport","pretty:target/cucumber-json-report.json","pretty:target/cucumber.xml" }, 
		features = "src/test/resources/features/",
		glue = {"com.mobile.app.test.steps"}
)
public class TestRunner {

}
