package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDivision 
//extends TC_AddCompanytest_002
{

	WebDriver ldriver;
//	TC_AddCompanytest_002 addCompany;
//	
//	String companyCode = addCompany.code();
//	String newcompcode = addCompany.code();
//	
	public AddDivision(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath = "//button[contains(.,'Master Tables')]")// Master tables
	@CacheLookup
	WebElement divisionmastertable;
	
	@FindBy(xpath = "//button[@routerlink='/division']") //Click Division from dropdown
	@CacheLookup
	WebElement division;
	
	@FindBy(xpath = "//button[contains(.,'Add New')]") //Click Add New Division
	@CacheLookup
	WebElement adddivisionbutton;
	
	@FindBy(xpath = "//select[@formcontrolname='companyCode']") //Click Company Code Dropdown 
	@CacheLookup
	WebElement divisioncompanycode;
	
	@FindBy(xpath = "/html/body/giv-root/giv-pages/clr-main-container/div/main/giv-add-division/"
			+ "div/div/form/div[1]/div[1]/clr-select-container/div/div/select/option[2]") // Select Company Code
	@CacheLookup
	WebElement selectcompanycode;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Division Code')]") //Fill Division Code
	@CacheLookup
	WebElement filldivisioncode;
	
	@FindBy(xpath = "//input[@placeholder='Division Name']") // Fill Division Name
	@CacheLookup
	WebElement filldivisionname;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']") //Fill Description
	@CacheLookup
	WebElement filldescription;
	
	@FindBy(xpath = "//textarea[@placeholder='Address 1']") //Fill Address1
	@CacheLookup
	WebElement filladdress1;
	
	@FindBy(xpath = "//input[@placeholder='City']") //Fill City
	@CacheLookup
	WebElement fillcity;
	
	@FindBy(xpath = "//input[@placeholder='State']") //Fill State
	@CacheLookup
	WebElement fillstate;
	
	@FindBy(xpath = "//input[@placeholder='Zip']") //Fill Zip
	@CacheLookup
	WebElement fillzip;
	
	@FindBy(xpath = "//input[@placeholder='Country']") // Fill Country
	@CacheLookup
	WebElement fillcountry;
	
	@FindBy(xpath = "//input[@placeholder='Contact Name']") //Fill Contact Name
	@CacheLookup
	WebElement fillcontactname;
	
	@FindBy(xpath = "//input[@placeholder='Contact Number']") // Fill contact Number
	@CacheLookup
	WebElement fillcontactnumber;
	
	@FindBy(xpath ="//input[@type='submit']") //Click submit
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
	
	public void clickdivmastertable() {
		divisionmastertable.click();
	}
	public void selectdivision() {
		division.click();
	}
	public void clickaddnewdivision() {
		adddivisionbutton.click();
	}
	public void selectcodedropdown() {
		divisioncompanycode.click();
	}
	
	public void selectcompcode() {
		selectcompanycode.click();
	}
	public void enterdivisioncode(String divisioncode) {
		filldivisioncode.sendKeys(divisioncode);
	}
	public void cleardivisioncode() {
		filldivisioncode.clear();
	}
	public void enterdivisionname(String divisionname) {
		filldivisionname.sendKeys(divisionname);
	}
	public void enterdescription(String description) {
		filldescription.sendKeys(description);
	}
	public void enteraddress1(String address1) {
		filladdress1.sendKeys(address1);
	}
	public void entercity(String city) {
		fillcity.sendKeys(city);
	}
	public void enterstate(String state) {
		fillstate.sendKeys(state);
	}
	public void enterzip(String zip) {
		fillzip.sendKeys(zip);
	}
	public void entercountry(String country) {
		fillcountry.sendKeys(country);
	}
	public void entercontactname(String contname) {
		fillcontactname.sendKeys(contname);
	}
	public void entercontactnumber(String contnumber) {
		fillcontactnumber.sendKeys(contnumber);
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
