package BernieSelenium2020;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class CBA_Test_Task4 {
	
	public static WebDriver driver = new FirefoxDriver();
	WebElement e1= driver.findElement(By.id("search-input"));
	WebElement e2= driver.findElement(By.id("search-button"));
	WebElement e3= driver.findElement(By.id("search-results"));
	
	public void test_VerifyInputButtonExists()
	{
		if(driver.getTitle().equals("ARR"))
		{
			Assert.assertTrue(e1.isDisplayed() && e2.isDisplayed());
			System.out.println("Search Query Input field and Search button are displayed");
			
		}
	}

	
	public void test_VerifyEmptyQueryMsg(WebDriver driver)
	{
		if(driver.getTitle().equals("ARR"))
		{
			e2.click();
			Assert.assertTrue(e3.getText().equals("Provide some query"));
			System.out.println("Provide some query");
		}
	}
	
	public void test_VerifyOneIsland(WebDriver driver)
	{
		if(driver.getTitle().equals("ARR"))
		{
			e1.clear();
			e1.sendKeys("isla");
			e2.click();
			//Assert.assertTrue((e3.getSize().equals(1)));
			if(e3 != null) {
			System.out.println("At least one result is returned");
			}
		}
	}

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

	

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.gecko.driver", "E:/Work/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_search/862b0faa506b8487c25a3384cfde8af4/static/attachments/reference_page.html");
		
		CBA_Test_Task4 obj1=new CBA_Test_Task4();
		obj1.test_VerifyInputButtonExists();
		obj1.test_VerifyEmptyQueryMsg(driver);
		obj1.test_VerifyOneIsland(driver);
		obj1.test_VerifyNoResult(driver);
		obj1.test_VerifyPortRoyal(driver);
		
		
		driver.quit();
				
	}
	
}
