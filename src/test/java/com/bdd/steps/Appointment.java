package com.bdd.steps;

import com.bdd.page.Appointmentpage;

import io.cucumber.java.en.Given;

public class Appointment extends Appointmentpage{
	
	@Given("Book an Appointment")
	public void book_an_Appointment() {
		Appointmentpage ap=new Appointmentpage();
		ap.boonanappointment();
		CaptureScreenShot("Appointment");
		

	}
}
