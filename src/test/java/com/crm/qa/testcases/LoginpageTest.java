package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginpageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test
	public void loginpageTitleTest()
	{
		String str=loginpage.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", str);
	}
	
	@Test
	public void loginTest()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
