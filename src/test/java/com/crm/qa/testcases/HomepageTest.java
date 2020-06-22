package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomepageTest extends TestBase{
	
	public HomePage homepage;
	public LoginPage loginpage;
	public CompaniesPage companypage;
	
	public HomepageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		
		String homePageTitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM" , "Title does not match");
		
	}
	
	@Test 
	public void clickOnCompanies()
	{
		companypage=homepage.clickOnCompaniesLink();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
