package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
@FindBy(xpath="//span[text()='Contacts']") WebElement contacts;
@FindBy(xpath="//span[text()='Companies']") WebElement companies;
@FindBy(xpath="//span[text()='Deals']") WebElement deal;
@FindBy(xpath="//span[text()='Tasks']") WebElement task;
@FindBy(xpath="//span[text()='Cases']") WebElement cases;
@FindBy(xpath="//span[text()='Email']") WebElement email;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

public String verifyHomePageTitle()
{
	String homePageTitle= driver.getTitle();
	return homePageTitle;
}


public ContactsPage clickOnContactLink()
{
	contacts.click();
	return new ContactsPage();
}

public CompaniesPage clickOnCompaniesLink()
{
	companies.click();
	return new CompaniesPage();
}

public DealsPage clickOnDealLink()
{
	deal.click();
	return new DealsPage();
}

public TasksPage clickOnTaskLink()
{
	task.click();
	return new TasksPage();
}

public CasesPage clickOnCasesLink()
{
	cases.click();
	return new CasesPage();
}

public EmailPage clickOnEmailLink()
{
	email.click();
	return new EmailPage();
}
}
