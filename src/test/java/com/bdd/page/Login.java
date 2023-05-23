package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

	
	public class Login extends BaseClass{
		

		@FindBy(xpath="//*[@id=\"username\"]")
		WebElement username;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"Inpatient Ward\"]")
		WebElement inpatient;
		
		@FindBy(xpath="//*[@id=\"loginButton\"]")
		WebElement login;
		
		public Login() {
			PageFactory.initElements(driver, this);
		}
		public void doLogin() {
			try {
				username.sendKeys("Admin");
				password.sendKeys("Admin123");
				inpatient.click();
				login.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}

