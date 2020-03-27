package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewEditCompany {
	
	WebDriver ldriver;

	public ViewEditCompany(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//clr-icon[contains(@shape,'eye')]") // click View
	@CacheLookup
	WebElement view;
	
	@FindBy(xpath = "//clr-icon[contains(@shape,'close')]") 	//Close View
	@CacheLookup
	WebElement closeview;
	
	@FindBy(xpath = "//clr-icon[@shape='pencil']") //Edit Company
	@CacheLookup
	WebElement clickeditcompany;
	
	@FindBy(xpath = "//textarea[@name='description']") //Description
	@CacheLookup
	WebElement editdescription;
	
	@FindBy(xpath = "//button[@type='submit']") //Click Update
	@CacheLookup
	WebElement clickupdate;
	
	@FindBy(xpath = "//button[contains(.,'Cancel')]") // click Cancel
	@CacheLookup
	WebElement clickcancel;
	
	public void clickview() {
		view.click();
	}
	public void closeviewpopup() {
		closeview.click();
	}
	public void clickedit() {
		clickeditcompany.click();
	}
	public void cleardesc() {
		editdescription.clear();
	}
	public void editdesc(String desc) {
		editdescription.sendKeys(desc);
	}
	public void update() {
		clickupdate.click();
	}
	public void cancel() {
		clickcancel.click();
	}
	
}
