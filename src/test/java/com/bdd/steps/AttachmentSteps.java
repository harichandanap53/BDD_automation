package com.bdd.steps;

import com.bdd.page.AttachmentPage;

import io.cucumber.java.en.Given;

public class AttachmentSteps extends AttachmentPage{
	

	@Given("To add an Attchment")
	public void to_add_an_Attchment() {
		AttachmentPage a=new AttachmentPage();
		a.addattachment();
		CaptureScreenShot("Attchment");
	
}

}
