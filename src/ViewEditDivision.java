package com.giv.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewEditDivision {
		
		WebDriver ldriver;

		public ViewEditDivision(WebDriver rdriver){
			
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		} 
		
		@FindBy(xpath = "//clr-icon[@shape='eye']") //Click View
		@CacheLookup
		WebElement view;
		
		@FindBy(xpath = "//clr-icon[@shape='close']") //Close view popup
		@CacheLookup
		WebElement closeview;
		
		@FindBy(xpath = "//clr-icon[@shape='pencil']") //Click Edit
		@CacheLookup
		WebElement edit;
		
		@FindBy(xpath = "//textarea[@name='description']") // Click descripiton
		@CacheLookup
		WebElement description;
		
		@FindBy(xpath = "//button[@type='submit']") //Click Update
		@CacheLookup
		WebElement update;
		
		public void clickview() {
			view.click();
		}
		public void exitview() {
			closeview.click();
		}
		public void clickedit() {
			edit.click();
		}
		public void cleardesc() {
			description.clear();
		}
		public void filldesc(String desc) {
			description.sendKeys(desc);
		}
		public void clickupdate() {
			update.click();
		}

	}

