package com.bdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bdd.base.BaseClass;

public class LogoutPage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	WebElement logout;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	public void Logout() {
		try {
			logout.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
