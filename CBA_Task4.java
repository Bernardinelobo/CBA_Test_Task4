package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CBA_Task4 {
	
	public static WebDriver driver = new FirefoxDriver();
	private WebElement e1;
	private WebElement e2;
	//public static WebElement e3= driver.findElement(By.id("search-results"));
	
	
	 @BeforeMethod
		public void setUp()
		{		
			System.setProperty("webdriver.gecko.driver", "E:/Work/geckodriver/geckodriver.exe");
			
			driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_search/862b0faa506b8487c25a3384cfde8af4/static/attachments/reference_page.html");
			e1= driver.findElement(By.id("search-input"));
			e2= driver.findElement(By.id("search-button"));
		}
	
	
	 @Test
	public void test_VerifyInputButtonExists()
	{
		 
		//WebElement e1= driver.findElement(By.id("search-input"));
		//WebElement e2= driver.findElement(By.id("search-button"));
		if(driver.getTitle().equals("ARR"))
		{
			Assert.assertTrue(e1.isDisplayed() && e2.isDisplayed());
			System.out.println("Search Query Input field and Search button are displayed");
			
		}
	}

	 /* 
	@Test
	public void test_VerifyEmptyQueryMsg(WebDriver driver)
	{
		if(driver.getTitle().equals("ARR"))
		{
			e2.click();
			Assert.assertTrue(e3.getText().equals("Provide some query"));
			System.out.println("Provide some query");
		}
	}
	
	@Test
	public void test_VerifyOneIsland(WebDriver driver)
	{
		if(driver.getTitle().equals("ARR"))
		{
			e1.clear();
			e1.sendKeys("isla");
			e2.click();
			if(e3 != null) {
			System.out.println("At least one result is returned");
			}
		}
	}

	@Test
	public void test_VerifyNoResult(WebDriver driver)
	{
		if(driver.getTitle().equals("ARR"))
		{
			e1.sendKeys("castle");
			e2.click();
			Assert.assertTrue((e3.getText().equals("No results")));
			System.out.println("No result is returned");
		}
	}

	@Test
	public void test_VerifyPortRoyal(WebDriver driver) 
	{
		if(driver.getTitle().equals("ARR"))
		{
			e1.clear();
			e1.sendKeys("Port");
			e2.click();
			Assert.assertTrue((e3.getText().equals("Port Royal")));
			System.out.println("Port Royal is returned");
		}
	}

	*/
       
    @AfterMethod
    public void closeBrowser()
    {
		driver.quit();
			
    }
		
}
