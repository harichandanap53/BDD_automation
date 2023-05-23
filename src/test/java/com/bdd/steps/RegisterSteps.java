package com.bdd.steps;

import com.bdd.page.Register;

import io.cucumber.java.en.Given;

public class RegisterSteps extends Register{
	
	@Given("Register a Patient")
	public void register_a_Patient() {
		Register r=new Register();
		r.doregister();
		CaptureScreenShot("Register");
	}

}
