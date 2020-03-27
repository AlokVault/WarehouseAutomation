package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddManufacturingPlant {
	WebDriver ldriver;

	public AddManufacturingPlant(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath = "//button[contains(@routerlink,'/mfgplant')]") //Click Manufacting Plant
	@CacheLookup
	WebElement clickmanufacturingplant;
	
	@FindBy(xpath = "//button[@routerlink='/add-mfgplant']") //Click Add manufacturing plant
	@CacheLookup
	WebElement addmanufacturingplant;
	
	@FindBy(xpath = "//select[@formcontrolname='companyCode']") //Company Code Dropdown
	@CacheLookup
	WebElement mfgcompanycodedropdown;
	
	@FindBy(xpath = "//input[@placeholder='Manufacturing Plant Code']") //Manufacturing Plant Code
	@CacheLookup
	WebElement manufacturinplantcode;
	
	@FindBy(xpath = "//input[@placeholder='Manufacturing Plant Name']") // Manufacturing Plant Name
	@CacheLookup
	WebElement manufacturinplantname;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']") //Description
	@CacheLookup
	WebElement manufacturinplantdescription;
	
	@FindBy(xpath = "//textarea[@placeholder='Address 1']") //Address 
	@CacheLookup
	WebElement manufacturinplantaddress;
	
	@FindBy(xpath = "//input[@placeholder='City']") //City
	@CacheLookup
	WebElement manufacturinplantcity;

	@FindBy(xpath = "//input[@placeholder='State']") //State
	@CacheLookup
	WebElement manufacturinplantstate;

	@FindBy(xpath = "//input[@placeholder='Zip']") //Zip
	@CacheLookup
	WebElement manufacturinplantzip;

	@FindBy(xpath = "//input[@placeholder='Country']") //Country
	@CacheLookup
	WebElement manufacturinplantcountry;
	
	@FindBy(xpath = "//input[@placeholder='Contact Name']") //Contact Name
	@CacheLookup
	WebElement manufacturinplantcontactname;
	
	@FindBy(xpath = "//input[@placeholder='Contact Number']") //Contact Number
	@CacheLookup
	WebElement manufacturinplantcontactnumber;
	
	@FindBy(xpath = "//button[contains(.,'Cancel')]") //Click Cancel
	@CacheLookup
	WebElement cancel;

	@FindBy(xpath = "//input[@type='submit']") // click Submit
	@CacheLookup
	WebElement submit;
	
	public void selectmfgplant() {
		clickmanufacturingplant.click();
	}
	public void clickaddnewmfg() {
		addmanufacturingplant.click();
	}
	public void selectcompanycodedropdown() {
		mfgcompanycodedropdown.click();
	}
	public void fillcompanycode() {
		
	}
	public void fillmfgcode(String mfgcode) {
		manufacturinplantcode.sendKeys(mfgcode);
	}
	public void clearmfgcode() {
		manufacturinplantcode.clear();
	}
	public void fillmfgplantname(String mfgname) {
		manufacturinplantname.sendKeys(mfgname);
	}
	public void fillmfgdescription(String desc) {
		manufacturinplantdescription.sendKeys(desc);
	}
	public void fillmfgaddress(String address) {
		manufacturinplantaddress.sendKeys(address);
	}
	public void fillmfgcity(String city) {
		manufacturinplantcity.sendKeys(city);
	}
	public void fillmfgstate(String state) {
		manufacturinplantstate.sendKeys(state);
	}
	public void fillmfgzip(String zip) {
		manufacturinplantzip.sendKeys(zip);
	}
	public void fillmfgcountry(String country) {
		manufacturinplantcountry.sendKeys(country);
	}
	public void fillcontactname(String contname) {
		manufacturinplantcontactname.sendKeys(contname);
	}
	public void fillcontactnumber(String contnumber) {
		manufacturinplantcontactnumber.sendKeys(contnumber);
	}
	public void clickcancel() {
		cancel.click();
	}
	public void clicksubmit() {
		submit.click();
	}











}

