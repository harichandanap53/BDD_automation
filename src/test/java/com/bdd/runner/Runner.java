package com.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	
	@CucumberOptions(features="src/test/resources/Features/feature3.feature", glue= {"com.bdd.steps"},dryRun=false, plugin = {"pretty", "html:target/cucumber-reports"})
	
	
	public class Runner {

}
