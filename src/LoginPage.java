package com.giv.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//input[@placeholder='Enter Username']") // UserName
	@CacheLookup
	WebElement textusername;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']") // PAssword
	@CacheLookup
	WebElement textpassword;
	// Login
	@FindBy(xpath= "//button[@type='submit']")
	@CacheLookup
	WebElement login;
	
//	//Reset
//	@FindBy(xpath ="/html/body/giv-root/giv-pages/clr-main-container/div/main/giv-login/div/form/div/div/button[2]")
//	@CacheLookup
//	WebElement reset;
	
	public void setusername(String uname) {
		textusername.sendKeys(uname); 
	}
	
	public void setpassword(String pass) {
		textpassword.sendKeys(pass);
	}
	
	public void clicklogin() {
		login.click();
	}
	
//	public void clickreset() {
//		reset.click(); 
//	}
	
}
