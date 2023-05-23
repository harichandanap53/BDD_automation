package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class AttachmentPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"org.openmrs.module.coreapps.createVisit\"]/div/div[2]")
	WebElement visit;
	
	@FindBy(xpath="//*[@id=\"start-visit-with-visittype-confirm\"]")
	WebElement confirm;
	
	@FindBy(xpath="//*[@id=\"attachments.attachments.visitActions.default\"]")
	WebElement attachment;
	
	@FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[2]/a")
	WebElement back;
	
	public AttachmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addattachment() {
		try {
			visit.click();
			confirm.click();
			attachment.click();
			back.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
