package com.bdd.steps;

import com.bdd.base.BaseClass;

import io.cucumber.java.en.Given;

public class CommonSteps extends BaseClass{
	
	@Given("To Open The Browser")
	public void to_Open_The_Browser() {
		initialize("chrome");
		
	}

}
