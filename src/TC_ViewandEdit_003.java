package com.giv.testcases;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.giv.pageobjects.AddCompany;
import com.giv.pageobjects.AddDivision;
import com.giv.pageobjects.AddManufacturingPlant;
import com.giv.pageobjects.AddWarehouse;
import com.giv.pageobjects.LoginPage;
import com.giv.pageobjects.ViewEditCompany;
import com.giv.pageobjects.ViewEditDivision;
import com.giv.pageobjects.ViewEditManufacturingPlant;
import com.giv.pageobjects.ViewEditWarehouse;

public class TC_ViewandEdit_003 extends BaseClass{
	
	@Test
	public void ViewAndEdit() throws Exception {
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username); //username from baseclass
		logger.info("Username Entered");
		
		lp.setpassword(password); //password from baseclass
		logger.info("Password Entered");
		
		lp.clicklogin();
		logger.info("Login Clicked");
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals(baseurl)) {
			logger.info("Login Successfull");
		}
		else
		{
			logger.info("Invalid Username and password entered");
		}
		
//<-----------------------------------------------  Company View and Edit  ------------------------------------------------------------------->		
		AddCompany ac = new AddCompany(driver);
		ac.clickmastertable();
		logger.info("master table clicked");
		Thread.sleep(2000);
		
		ac.clickcompany();
		logger.info("Company clicked");
		Thread.sleep(2000);
		
		ViewEditCompany vc = new ViewEditCompany(driver);
		vc.clickview();
		logger.info("View clicked");
		Thread.sleep(2000);
		
		vc.closeviewpopup();
		logger.info("View closed");
		
		vc.clickedit();
		logger.info("Edit Clicked");
	
		vc.cleardesc();
		logger.info("Clear description");
		
		vc.editdesc("This is changed description");
		logger.info("Description Changed");
		
		vc.update();
		logger.info("Updated the new data");
		
//<--------------------------------------------- Division View and Edit ---------------------------------------------------------------------->		
		AddDivision ad =new AddDivision(driver);
		ad.clickdivmastertable();
		logger.info("Mastertable clicked");
		
		ad.selectdivision();
		logger.info("Division Selected");
		
		ViewEditDivision vd = new ViewEditDivision(driver);
		vd.clickview();
		logger.info("View clicked");
		
		vd.exitview();
		logger.info("View closed");
		
		vd.clickedit();
		logger.info("Edit cliked");
		
		vd.cleardesc();
		logger.info("Description Cleared");
		
		vd.filldesc("This is new description");
		logger.info("Description changed");
		
		vd.clickupdate();
		logger.info("Updated");
		
//<--------------------------------------------- Warehouse View and Edit ---------------------------------------------------------------------->
		AddCompany ad1 = new AddCompany(driver);
		ad1.clickmastertable();
		logger.info("Master table Clicked");
		
		AddWarehouse aw = new AddWarehouse(driver);
		aw.clickwarehouse();
		logger.info("Warehouse Selected");
		
		ViewEditWarehouse vw = new ViewEditWarehouse(driver);
		vw.clickview();
		logger.info("View clicked");
		
		vw.closeviewpopup();
		logger.info("View closed");
		
		vw.clickedit();
		logger.info("Edit clicked");
		
		vw.cleardesc();
		logger.info("Desc cleared");
		
		vw.editdesc("This is new Description");
		logger.info("New description entered");
		
		vw.update();
		logger.info("Updated warehouse");
		
//<--------------------------------------------- Manufacturing Plant View and Edit ------------------------------------------------------------>
		AddCompany ad2 = new AddCompany(driver);
		ad2.clickmastertable();
		logger.info("Master table Clicked");
		
		AddManufacturingPlant am = new AddManufacturingPlant(driver);
		am.selectmfgplant();
		logger.info("Manufacturing Plant Selected");
		
		ViewEditManufacturingPlant vm = new ViewEditManufacturingPlant(driver);
		vm.clickview();
		logger.info("View clicked");
		
		vm.closeviewpopup();
		logger.info("View closed");
		
		vm.clickedit();
		logger.info("Edit clicked");
		
		vm.cleardesc();
		logger.info("Desc cleared");
		
		vm.editdesc("This is new Description");
		logger.info("New description entered");
		
		vm.update();
		logger.info("Updated warehouse");
		
		
//		ac.clickmastertable();
//		driver.findElement(By.xpath("//button[@routerlink='/items']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Package Barcode']")).sendKeys("7701453968857");
//		driver.findElement(By.xpath("//input[@placeholder='Package Barcode']")).sendKeys(Keys.ENTER);
//		if(driver.findElement(By.xpath("//a[contains(.,'7701453968857')]")).equals("7701453968857")) {
//			logger.info("Search found");
//		}
//		else {
//			logger.info("Search not found");
//		}
//		
		
	}
	//on test failure call this method and take a screenshot
//		public void capturescreenshot(WebDriver driver, String tname) throws IOException {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png"); 
//			FileUtils.copyFile(source,target);
//			System.out.println("Screenshot Taken");
//		}
//
//	ac.clickforlogout();
//	Thread.sleep(2000);
//	ac.logout();
	@AfterClass
	public void teardown() {
		driver.quit();
	
	}
}
