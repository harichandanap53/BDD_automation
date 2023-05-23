package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;


public class Appointmentpage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"appointmentschedulingui.requestAppointmentDashboardLink\"]/div/div[2]")
	WebElement book;
	
	@FindBy(xpath="//*[@id=\"appointment-type\"]")
	WebElement AType;
	
	@FindBy(xpath="//*[@id=\"typeahead-3-3197-option-0\"]/a")
	WebElement surgery;
	
	@FindBy(xpath="//*[@id=\"save-button\"]")
	WebElement save;
	
	public Appointmentpage() {
		PageFactory.initElements(driver, this);
	}
	public void boonanappointment() {
		try {
			book.click();
			AType.sendKeys("Surgery");
			surgery.click();
			save.click();
		} catch (Exception e) {
			
		}
	}

}


