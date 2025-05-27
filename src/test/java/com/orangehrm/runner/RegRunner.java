package com.orangehrm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
								glue="com.orangehrm.steps",
								stepNotifications=true,
								dryRun=false,
								tags="@wip0404a",
								plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
										"html:target/cucumber-reports/reports.html"},
								monochrome = true)
public class RegRunner {

}