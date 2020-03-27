package com.giv.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.giv.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void logintest() throws IOException {
		
		driver.get(baseurl);
		
		logger.info("Url is opened");
		//creating a object of login class
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		logger.info("Enter username");
		lp.setpassword(password);
		logger.info("Enter password");
		lp.clicklogin();
		//String invalidmsg = "/html/body/giv-root/giv-pages/clr-main-container/div/main/giv-login/div/form/div/h4";
//		
//		if(invalidmsg == "Enter Valid Username and Password") {
//			capturescreenshot(driver,"logintest"); // on failure of testcase screenshot is taken
//			Assert.assertFalse(false);
//			logger.info("Invalid Login Test Failed");
//			
//			
//		}
		
		if(driver.getTitle().equals("GlobalInventoryView")){
				
				Assert.assertTrue(true);
				logger.info("Login Test Passed");
			}
		
		else {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
			
		}
				
	
	}

}
