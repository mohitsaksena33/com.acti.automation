package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;


/*
 * Name:LoginPage
 * Author:Mohit
 * 
 */

public class LoginPage extends DriverScript {
	
	//*********************************************Page Elements***************************
	@FindBy(id="username") WebElement tbUsername;
	@FindBy(name="pwd") WebElement tbPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement btnLogin;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	//*****************************************Page Initialization***************************
	//PageFactory is class in Selenium which is used to initialize Current Page Class Elements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//*****************************************Page Actions********************************
	
	public void enterUsername(String username)
	{
		tbUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		tbPassword.sendKeys(password);
	}
	public void clickLoginButton()
	{
		btnLogin.click();
	}
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	

}
