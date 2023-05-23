package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class FindaPatient extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
	WebElement find;
	
	@FindBy(xpath="//*[@id=\"patient-search\"]")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[2]")
	WebElement cli;
	
	public FindaPatient() {
		PageFactory.initElements(driver, this);
	}
	
	public void tofind() {
		try {
			find.click();
			search.sendKeys("UNKNOWN UNKNOWN");
			cli.click();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}

}
