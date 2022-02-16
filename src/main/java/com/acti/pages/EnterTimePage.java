package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript{
	
//***********************************************PageElement***********************************//
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textUserLoggedIn;
	

//*****************************************Page Initialization******************************//
	
	public  EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}


//**********************************Page Methods******************************************//

	public void clicklogout()
	{
		linkLogout.click();
	}

	public String verifyUserLoggedin()
	
	{
		return textUserLoggedIn.getText();
		
	}


}