package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyAccountPage {
	
	WebDriver driver;
	private static final int TIMEOUT = 10;  // 10 seconds timeout
	
	
	public MyAccountPage(WebDriver driver)
	{
		//this.driver=driver;
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	//Locators
	@FindBy(xpath="//a[normalize-space()='Log Out']") 
	@CacheLookup private WebElement logOut;
	
	@FindBy(xpath="//a[normalize-space()='Open New Account']") 
	@CacheLookup private WebElement openNewAccount;
	
	@FindBy(xpath="//*[@id=\"accountTable\"]/tbody/tr[2]/td[2]")
	@CacheLookup private WebElement accountBalance;
	
	
	
	
	//Returns
	public WebElement getlogOut() {
		return logOut;
	}
	
	public WebElement getaccountBalance() {
		return accountBalance;
	}
	
	//Actions
	public boolean isDisablelogOut() {
		return logOut.isDisplayed();
	}
	
	public boolean isaccountBalanceDisplay() {
		return accountBalance.isDisplayed();
	}
	
	public void clickOnlogOut() {
		 logOut.click();
	}
	
}