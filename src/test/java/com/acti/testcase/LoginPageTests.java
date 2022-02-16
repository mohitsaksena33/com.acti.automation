package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;


public class LoginPageTests extends BaseTest {
	
	
	@Test(enabled = true)
	public void testValidateLoginPageDisplayed()
	{
		
		initApplication();
		
		LoginPage lp = new LoginPage();
		String title = lp.getLoginPageTitle();
		Assert.assertTrue(title.contains("Login"));
		quitBrowser();
	}
	@Test(enabled = true)
	public void validateLogo()
	{
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
		quitBrowser();
	}
	
	/*@Test(enabled = false)
	public void testLoginFunction() 
	{
		initApplication();
		LoginPage lp = new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		String actual = ep.verifyUserLoggedin();
		System.out.println(actual);
		ep.clicklogout();
		
	} */
	

	@Test(dataProvider = "actiData")
	public void testLoginFunction(String username, String password)
	{
	
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLoginButton();	
		EnterTimePage ep = new EnterTimePage();
		String actual = ep.verifyUserLoggedin();
		System.out.println(actual);
		ep.clicklogout();
	}
	
	
	

}
