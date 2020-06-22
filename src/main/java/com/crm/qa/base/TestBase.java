package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
 public static WebDriver driver;
 public static Properties prop;
 
 public TestBase()
 {
	 prop=new Properties();
	 FileInputStream ip;
	try {
		ip = new FileInputStream("C:\\Users\\Shweta Choubey\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		
			prop.load(ip);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
 
 
 public static void initialization()
 {
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta Choubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shweta Choubey\\Downloads\\chromedriver_win32\\firefox.exe");
		driver=new FirefoxDriver();
	}

	String URL=prop.getProperty("url");
	
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT	, TimeUnit.SECONDS);
	 driver.get(URL);
 }
 }
