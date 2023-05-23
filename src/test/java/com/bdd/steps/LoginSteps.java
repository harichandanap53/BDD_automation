package com.bdd.steps;



	import com.bdd.page.Login;

	import io.cucumber.java.en.Given;

	public class LoginSteps extends Login{
		
		@Given("To Login the WebSite")
		public void to_Login_the_WebSite() {
			Login lp=new Login();
			lp.doLogin();
			CaptureScreenShot("Login");
			
		}

	}



