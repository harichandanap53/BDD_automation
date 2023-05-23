package com.bdd.steps;

import com.bdd.page.FindaPatient;

import io.cucumber.java.en.Given;

public class Findapatient extends FindaPatient{
	
	@Given("Find a Patient")
	public void find_a_Patient() {
		FindaPatient fp=new FindaPatient();
		fp.tofind();
		CaptureScreenShot("Find a Patient");
	}

}
