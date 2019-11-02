package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Login.Feature"
		,glue="com.stepdefinitions"
		,monochrome=true
		,tags="@PositiveScenario"
		,dryRun=false
		,format="pretty")
public class TestRunner {

}
