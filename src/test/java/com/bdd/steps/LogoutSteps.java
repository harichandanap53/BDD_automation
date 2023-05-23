package com.bdd.steps;

import com.bdd.page.Login;
import com.bdd.page.LogoutPage;

import io.cucumber.java.en.Given;

public class LogoutSteps extends Login{
	
	@Given("Logout")
	public void logout() {
		LogoutPage l= new LogoutPage();
		l.Logout();
	}

}
