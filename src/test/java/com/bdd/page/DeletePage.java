package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class DeletePage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"org.openmrs.module.coreapps.deletePatient\"]/div/div[2]")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\"delete-reason\"]")
	WebElement reason;
	
	@FindBy(xpath="//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]")
	WebElement confirm;
	
	public DeletePage() {
		PageFactory.initElements(driver, this);
	}
	public void deleteapatient() {
		try {
			delete.click();
			reason.sendKeys("Discharge");
			confirm.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
