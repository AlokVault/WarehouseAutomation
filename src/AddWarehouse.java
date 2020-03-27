package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWarehouse {
	
	WebDriver ldriver;

	public AddWarehouse(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
   }
	@FindBy(xpath = "//button[contains(@routerlink,'/warehouse')]") //Click Warehouse
	@CacheLookup
	WebElement selectwarehouse;
	
	@FindBy(xpath = "//button[contains(@routerlink,'/add-warehouse-data')]") //Click Add New Warehouse
	@CacheLookup
	WebElement addwarehousebutton;
	
	@FindBy(xpath = "//select[contains(@formcontrolname,'companyCode')]") // Select Dropdown for Company Code
	@CacheLookup
	WebElement warehousecompanycodedropdown;
	
	@FindBy(xpath = "/html/body/giv-root/giv-pages/clr-main-container/div/main/"
			+ "giv-add-warehouse/div/div/form/div[1]/div[1]/clr-select-container[1]/div/div/select/option[2]") //Select Company Code
	@CacheLookup
	WebElement entercompanycode;

	@FindBy(xpath = "//select[@formcontrolname='divisionCode']") //Select Dropdown for Division Code
	@CacheLookup
	WebElement warehousedivisioncodedropdown;
	
	@FindBy(xpath = "/html/body/giv-root/giv-pages/clr-main-container/div/main/"
			+ "giv-add-warehouse/div/div/form/div[1]/div[1]/clr-select-container[2]/div/div/select/option[2]") //Select Division Code
	@CacheLookup
	WebElement enterdivisioncode;
	
	@FindBy(xpath = "//input[@placeholder='Warehouse Code']") //Fill WarehouseCode
	@CacheLookup
	WebElement enterwarehousecode;
	
	@FindBy(xpath = "//input[@placeholder='Warehouse Name']") //Fill WarehouseName
	@CacheLookup 
	WebElement enterwarehousename;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']") //Fill Description
	@CacheLookup
	WebElement enterwarehousedescription;
	
	@FindBy(xpath = "//input[@formcontrolname='contactName']") //Fill contact Name
	@CacheLookup
	WebElement enterwarehousecontactname;
	
	@FindBy(xpath = "//input[@placeholder='Contact Number']") //Fill Contact Number
	@CacheLookup
	WebElement enterwarehousecontactnumber;
	
	@FindBy(xpath = "//textarea[@placeholder='Address 1']") //Fill Address1
	@CacheLookup
	WebElement enterwarehouseaddress1;
	
	@FindBy(xpath = "//input[@placeholder='City']") // Fill City
	@CacheLookup
	WebElement enterwarehousecity;
	
	@FindBy(xpath = "//input[@placeholder='State']") //Fill State
	@CacheLookup
	WebElement enterwarehousestate;
	
	@FindBy(xpath = "//input[@placeholder='Zip']") //Fill zip
	@CacheLookup
	WebElement enterwarehousezip;
	
	@FindBy(xpath = "//input[@placeholder='Country']") //Fill Country
	@CacheLookup
	WebElement enterwarehousecountry;
	
	@FindBy(xpath = "//input[@type='submit']") // Click Submit
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
	
	public void clickwarehouse() {
		selectwarehouse.click();
	}
	public void addwarehousebutt() {
		addwarehousebutton.click();
	}
	public void selectcompanydropdown() {
		warehousecompanycodedropdown.click();
	}
	public void fillcompanycode() {
		entercompanycode.click();
	}
	public void selectdivsiondropdown() {
		warehousedivisioncodedropdown.click();
	}
	public void filldivisioncode() {
		enterdivisioncode.click();
	}
	public void fillwarehousecode(String warehousecode) {
		enterwarehousecode.sendKeys(warehousecode);
	}
	public void clearwarehousecode() {
		enterwarehousecode.clear();
	}
	public void fillwarehousename(String warehousename) {
		enterwarehousename.sendKeys(warehousename);
	}
	public void fillwarehousedescription(String warehousedescription) {
		enterwarehousedescription.sendKeys(warehousedescription);
	}
	public void fillwarehousecontactname(String warehousecontactname) {
		enterwarehousecontactname.sendKeys(warehousecontactname);
	}
	public void fillwarehousecontactnumber(String warehousecontactnumber) {
		enterwarehousecontactnumber.sendKeys(warehousecontactnumber);
	}
	public void fillwarehouseaddress1(String warehouseaddress1) {
		enterwarehouseaddress1.sendKeys(warehouseaddress1);
	}
	public void fillwarehousecity(String warehousecity) {
		enterwarehousecity.sendKeys(warehousecity);
	}
	public void fillwarehousestate(String warehousestate) {
		enterwarehousestate.sendKeys(warehousestate);
	}
	public void fillwarehousezip(String warehousezip) {
		enterwarehousezip.sendKeys(warehousezip);
	}
	public void fillwarehousecountry(String warehousecountry) {
		enterwarehousecountry.sendKeys(warehousecountry);
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