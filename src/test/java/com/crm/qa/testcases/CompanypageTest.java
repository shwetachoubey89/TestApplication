package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CompanypageTest extends TestBase {

	
	public HomePage homepage;
	public LoginPage loginpage;
	public CompaniesPage companypage;
	
	public CompanypageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		companypage=homepage.clickOnCompaniesLink();
	}
	
	@Test(priority=1)
	public void verifyHeadingOfContact()
	{
		companypage.verifyHeadingContactPage();
	}
	
	
	@Test(priority=2)
	public void createNewCompany()
	{
		
		companypage.createNewCompany("Shweta Test");
	}
	

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
