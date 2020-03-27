package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompany {

	WebDriver ldriver;

	public AddCompany(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//button[contains(.,'Master Tables')]")// Master tables
	@CacheLookup
	WebElement mastertable;
		
	@FindBy(xpath ="//button[@routerlink='/company']")// Click Company
	@CacheLookup
	WebElement company;
	
	@FindBy(xpath ="//button[contains(.,'Add New')]")// Click Add company
	@CacheLookup
	WebElement addcompany;
	
	@FindBy(xpath ="//input[@placeholder='Company Code']")//Fill Company code
	@CacheLookup
	WebElement companycode;
	
	@FindBy(xpath ="//input[@placeholder='Company Name']")// Fill Company name 
	@CacheLookup
	WebElement companyname;
	
	@FindBy(xpath ="//textarea[@placeholder='Description']")//Fill Description
	@CacheLookup
	WebElement description;
	
	@FindBy(xpath ="//textarea[@formcontrolname='address1']")//Fill Address 1
	@CacheLookup
	WebElement address1;

	@FindBy(xpath="//input[@placeholder='City']") // Fill City
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//input[@placeholder='State']") // Fill State
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//input[@placeholder='Zip']") // Fill zip
	@CacheLookup
	WebElement zip;
	
	@FindBy(xpath="//input[@placeholder='Country']") // Fill Country
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath="//input[@placeholder='Contact Name']") // Fill Contact Name
	@CacheLookup
	WebElement contactname;
	
	@FindBy(xpath="//input[@placeholder='Contact Number']") // Fill Contact Number
	@CacheLookup
	WebElement contactnumber;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]") //Click submit
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-sm btn-secondary')]") // CLick Cancel
	@CacheLookup
	WebElement cancel;
	
	@FindBy(xpath = "//button[contains(.,'givadmin')]")// CLick givadmin for logout
	@CacheLookup
	WebElement clickgivadmin;
	
	@FindBy(xpath="//a[contains(.,'Logout')]") //Click Logout
	@CacheLookup
	WebElement clicklogout;
	
	
	public void clickmastertable() {
		mastertable.click();
	}
	public void clickcompany() {
		company.click();
	}
	public void addnewcompany() {
		addcompany.click();
	}
	
	public void entercompanycode(String compcode) {
		companycode.sendKeys(compcode);
	}
	public void clearcompanycode() {
		companycode.clear();
	}
	public void entercompanyname(String compname) {
		companyname.sendKeys(compname);
	}
	public void enterdescription(String desc) {
		description.sendKeys(desc);
	}
	public void enteraddress1(String addr1) {
		address1.sendKeys(addr1);
	}
	public void entercity(String companycity) {
		city.sendKeys(companycity);
	}
	public void enterstate(String companystate) {
		state.sendKeys(companystate);
	}
	public void enterzip(String companyzip) {
		zip.sendKeys(companyzip);
	}
	public void entercountry(String companycountry) {
		country.sendKeys(companycountry);
	}
	public void entercontactname(String contname) {
		contactname.sendKeys(contname);
	}
	public void entercontactnumber(String customercontact) {
		contactnumber.sendKeys(customercontact);
	}
	public void clicksubmit() {
		submit.click();
	}
	public void clickcancel() {
		cancel.click();
	}
	public void clickforlogout() {
		clickgivadmin.click();
	}
	public void logout() {
		clicklogout.click();
	}
	
	
	
	
}
