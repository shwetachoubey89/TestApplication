package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	//Object Repository
@FindBy(name="email") WebElement username;
@FindBy(name="password") WebElement password;
@FindBy(xpath=".//div[text()='Login']") WebElement LoginBtn;
@FindBy(xpath=".//a[text()='Sign Up']") WebElement SignUp;

//Initializing page object
public LoginPage()
{
	PageFactory.initElements(driver, this);
}

//Action
public String validateLoginPageTitle()
{
	return driver.getTitle();
}

public HomePage login(String un,String pd)
{
	username.sendKeys(un);
	password.sendKeys(pd);
	LoginBtn.click();
	
	return new HomePage();
}
}
