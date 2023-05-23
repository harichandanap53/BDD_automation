package com.bdd.steps;

import com.bdd.page.DeletePage;

import io.cucumber.java.en.Given;

public class DeleteSteps extends DeletePage{

	@Given("Delete a patient")
	public void delete_a_patient() {
		DeletePage dp=new DeletePage();
		dp.deleteapatient();
		CaptureScreenShot("Delete");
		
	
}

}
