package com.giv.testcases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.giv.pageobjects.AddCompany;
import com.giv.pageobjects.AddDivision;
import com.giv.pageobjects.AddManufacturingPlant;
import com.giv.pageobjects.AddWarehouse;
import com.giv.pageobjects.LoginPage;

public class TC_AddCompanytest_002 extends BaseClass {

	String companyCode = "LEONISA";
	String newcompcode;
	int i=1;
	
	public String code() {
		companyCode = "LEONISA";
		return companyCode;		
	}
//<-----------------------------------Filling Company Details-------------------------------------------------->	
	@Test
	public void addnewcustomer() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username); //username from baseclass
		logger.info("Username entered");
		
		lp.setpassword(password); //password from baseclass
		logger.info("Password Entered");
		
		lp.clicklogin();
		logger.info("Login Clicked");
		Thread.sleep(1000);
		
		if(driver.getCurrentUrl().equals(baseurl)) {
			logger.info("Login Successfull");
		}
		else
		{
			logger.info("Invalid Username and password entered");
		}
		
		AddCompany ac = new AddCompany(driver);
			
		ac.clickmastertable();
		logger.info("Master Table Clicked");
		
		ac.clickcompany();
		logger.info("Company Clicked");
		
		logger.info("entering data-------------->");
		ac.addnewcompany();
		logger.info("Add new company added");

		ac.entercompanycode(companyCode);
		logger.info("Company code entered");
		
		ac.entercompanyname("Company name");
		logger.info("Company name entered");
		
		ac.enterdescription("New Company");
		logger.info("Description entered");
		
		ac.enteraddress1("Boston");
		logger.info("Address1 entered");
		
		ac.entercity("Boston");
		logger.info("City Entered");
		
		ac.enterstate("Boston");
		logger.info("State entered");
		
		ac.enterzip("232123");
		logger.info("Zip code Entered");
		
		ac.entercountry("Boston");
		logger.info("Country entered");
		
		ac.entercontactname("Alok");
		logger.info("Contact name entered");
		
		ac.entercontactnumber("343242343");
		logger.info("Contact number entered");
		
		ac.clicksubmit();
		
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals(baseurl+"company")){
			logger.info("Company Created Successfull");
			}
		else {
			logger.info("Comapny already exists changing he code");
			
			int a = i;
	    	ac.clearcompanycode();
			ac.entercompanycode(newcompcode = companyCode + a++);
		
			logger.info("Companycode Changed");
						
			ac.clicksubmit();
				
			if(driver.getCurrentUrl().equals(baseurl+"company")) {
				logger.info("Comapny Created");	
			}
			else {
				ac.clickcancel();
				logger.info("Cancel clicked beacuse Comapny already exists");
			}
			
		}
		
			
// <------------------------------------------Filling the Division Details ----------------------------------->
		AddDivision ad = new AddDivision(driver);	
		
		Thread.sleep(2000);
		ad.clickdivmastertable();
		logger.info("Master Table Clicked");
		//Thread.sleep(2000);
	
		ad.selectdivision();
		logger.info("Division selected");
		
		ad.clickaddnewdivision();
		logger.info("Add new Division selected");
		
		ad.selectcodedropdown();
		logger.info("Divsion selected from dropdown");
				
		ad.selectcompcode();
		logger.info("Company Code selected");
		
		ad.enterdivisioncode("LEONISA");
		logger.info("Divisioncode Entered");
		
		ad.enterdivisionname("Divsion1");
		logger.info("Division name entered");
		
		ad.enterdescription("This is new Division");
		logger.info("Division description entered");
		
		ad.enteraddress1("Address1");
		logger.info("This is the new address");
		
		ad.entercity("Boston");
		logger.info("City name entered");
		
		ad.enterstate("Boston");
		logger.info("State entered");
		
		ad.enterzip("2323");
		logger.info("Zip entered");
		
		ad.entercountry("Boston");
		logger.info("Country Entered");
		
		ad.entercontactname("Alok");
		logger.info("Contact name Entered");
		
		ad.entercontactnumber("2423423");
		logger.info("Contact number entered");

		ad.clicksubmit();
		logger.info("Division Created");
		
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals(baseurl +"division")){
			logger.info("Divsion Created Successfull");
		}
		else {
			 logger.info("Division already existes");
			 
			ad.cleardivisioncode();
			ad.enterdivisioncode("LEONISA"+ i++);
			logger.info("Divisioncode Changed");
		
			ad.clicksubmit();
			logger.info("Division Created after changing");
				
		if(driver.getCurrentUrl().equals(baseurl + "division")) {
		
			logger.info("Dividion Changed");
		}
			else {
					ad.clickcancel();
					logger.info("Cancel Clicked because company creation failed");
					Thread.sleep(2000);
				}
			

		}
		
//<------------------------------------------------Filling Warehouse Details------------------------------------------------------------------>		
	
		Thread.sleep(2000);
		ac.clickmastertable();
		logger.info("Master Table Clicked");
		
		AddWarehouse aw = new AddWarehouse(driver);
		
		aw.clickwarehouse();
		logger.info("Warehoue Clicked");
		
		aw.addwarehousebutt();
		logger.info("Add new warehouse button clicked");
		Thread.sleep(5000);
		
		aw.selectcompanydropdown();
		logger.info("Company drop down selected");
		Thread.sleep(5000);
		
		aw.fillcompanycode();
		logger.info("Company code for warehouse entered");
		
		Thread.sleep(5000);
		aw.selectdivsiondropdown();
		logger.info("Divison drop dwon clicked");
		
		Thread.sleep(5000);
		aw.filldivisioncode();
		logger.info("Division for warehouse entered");
		
		aw.fillwarehousecode("CSB");
		logger.info("Warehouse code entered");
		
		aw.fillwarehousename("warehouse1");
		logger.info("Warehouse name entered");
		
		aw.fillwarehousedescription("This is a warehouse");
		logger.info("Warehouse description entered");
		
		aw.fillwarehousecontactname("Alok");
		logger.info("Warehouse Contact Name Entered");
		
		aw.fillwarehousecontactnumber("223324324");
		logger.info("Warehouse contact number entered");
		
		aw.fillwarehouseaddress1("Columbia");
		logger.info("Warehouse address entered");
		
		aw.fillwarehousecity("Columbia");
		logger.info("Warehouse city entered");
		
		aw.fillwarehousestate("Columbia");
		logger.info("Warehouse state entered");
		
		aw.fillwarehousezip("432345");
		logger.info("Warehouse zip code entered");
		
		aw.fillwarehousecountry("America");
		logger.info("Warehouse country entered");
		
		aw.clicksubmit();
		if(driver.getCurrentUrl().equals(baseurl + "warehouse")) {
		logger.info("Warehouse Created Successfully");	
		}
		else {
			aw.clearwarehousecode();
			aw.fillwarehousecode("CSB"+i++);
			logger.info("Warehoouse code changed");
			aw.clicksubmit();
			logger.info("Warehouse created after changing");
			
			if(driver.getCurrentUrl().equals(baseurl +"warehouse")) {
			logger.info("Warehouse Code Changed");	
			}
			else {
				aw.clickcancel();
				logger.info("Clicked cancel because Warehouse Code already exists");
			}
		}
		
//-------------------------------------------Filling Manufacturing Plant------------------------------>
	
		ad.clickdivmastertable();
		logger.info("Master table Clicked");
		
		AddManufacturingPlant mfg = new AddManufacturingPlant(driver);
		mfg.selectmfgplant();
		logger.info("Manufacturing Plant Clicked");
		
		mfg.clickaddnewmfg();
		logger.info("Add new Manufacturing Plant clicked");
		
		mfg.selectcompanycodedropdown();
		logger.info("Company drop down selected");
		Thread.sleep(2000);
		
		mfg.fillcompanycode();
		logger.info("Company Code for mfg entered");
		Thread.sleep(2000);
		
		mfg.fillmfgcode("MFG001");
		logger.info("Manufacturing Plant Code entered");
		
		mfg.fillmfgplantname("Manufacturing Plant");
		logger.info("The mfg name entered");
		
		mfg.fillmfgdescription("This is new mfg plant");
		logger.info("Description Entered");
		
		mfg.fillmfgaddress("Address");
		logger.info("Address entered ");
		
		mfg.fillmfgcity("Boston");
		logger.info("City entered");
		
		mfg.fillmfgstate("Boston");
		logger.info("State Entered");
		
		mfg.fillmfgzip("34324");
		logger.info("Zip entered");
		
		mfg.fillmfgcountry("Boston");
		logger.info("Country Name Entered");
	
		mfg.fillcontactname("Alok kumar");
		logger.info("Contact name Entered");
		
		mfg.fillcontactnumber("4234324");
		logger.info("Contact number entered");
		
		mfg.clicksubmit();
		if(driver.getCurrentUrl().equals(baseurl+"mfgplant")) {
			logger.info("Manufacturing Plant Created Successfully");
		}
		else {
			mfg.clearmfgcode();
			mfg.fillmfgcode("MFG001"+i++);
			logger.info("Manufacturing Plant code changed");
			mfg.clicksubmit();
			logger.info("Manufacturing Plant created after changing");
			
			if(driver.getCurrentUrl().equals(baseurl+"mfgplant")) {
			logger.info("Manufacturing Plant  Code Changed");	
			}
			else {
				mfg.clickcancel();
				logger.info("Clicked cancel because Manufucatuing Plant already exists");
			}
		
			
		}
		
			ad.clickforlogout();
			Thread.sleep(2000);
			ad.logout();
			Thread.sleep(1000);
			if(driver.getCurrentUrl().equals(baseurl)) {
				logger.info("Logout successful");
			}
			else
			{
				logger.info("Logout un-successful");
	
		}
	
	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	
	}

}
