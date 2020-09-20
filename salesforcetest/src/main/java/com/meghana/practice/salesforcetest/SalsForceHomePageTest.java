package com.meghana.practice.salesforcetest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalsForceHomePageTest {
	
	public String baseUrl = "https://www.salesforce.com/in";
	public String driverPath = "C://DRIVER//chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void TestVerifyHomepageTitle() {
		driver.get(baseUrl);
		String expectedTitle = "CRM Software: Cloud Computing Solutions For Every Business - Salesforce IN";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	
  @BeforeMethod
	public void resetBaseUrl() {
		System.out.println("Executing before method");
		//driver.get(baseUrl);

	     }

  @BeforeTest
  public void launchBrowser() {
		System.out.println("Executing before test");
		System.setProperty("webdriver.chrome.driver", driverPath); // small c
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

}
