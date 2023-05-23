package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class Register extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")
	WebElement Register;
	
	@FindBy(xpath="//*[@id=\"checkbox-unknown-patient\"]")
	WebElement unidentified;
	
	@FindBy(xpath="//*[@id=\"gender-field\"]/option[1]")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"next-button\"]")
	WebElement next;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement confirm;
	
	@FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[1]/a/i")
	WebElement home;
	
	public Register() {
		PageFactory.initElements(driver, this);
	}
	public void doregister() {
		try {
			Register.click();
			unidentified.click();
			Thread.sleep(1000);
			gender.click();
			Thread.sleep(1000);
			next.click();
			confirm.click();
			home.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
