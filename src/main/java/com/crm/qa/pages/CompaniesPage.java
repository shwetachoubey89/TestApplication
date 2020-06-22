package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase{
	@FindBy(xpath="(.//input[@name='name'])[1]") WebElement nameOfCompany;
	@FindBy(xpath="(.//div[@id='dashboard-toolbar'])//following::form[@class='ui form segment custom-form-container']") WebElement form;
	@FindBy(xpath=".//label[text()='Name']") WebElement nameLabel;
	@FindBy(xpath=".//button[text()='New']") WebElement newCompanyBtn;
	@FindBy(xpath=".//button[text()='Save']") WebElement saveBtn;
	@FindBy(xpath=".//button[text()='Cancel']") WebElement cancelBtn;
	@FindBy(xpath="//div[text()='Create new Company']") WebElement headingContact;
	@FindBy(xpath="(.//i[@class='settings icon'])[1]") WebElement settingIcon;
	@FindBy(xpath=".//button[text()='Public']") WebElement publicBtn;
	
	
	public CompaniesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
public void createNewCompany(String company_name)
{
	newCompanyBtn.click();
	
	nameOfCompany.sendKeys(company_name);
	saveBtn.click();
	
}

public void verifyHeadingContactPage() {
	newCompanyBtn.click();
	//System.out.println(form.isDisplayed());
	Assert.assertTrue(headingContact.isDisplayed(), "heading not dispalyed");
}

}
