package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Unit test for simple App.
 */
public class SeleniumPractice 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void AssertionChecking()
    {
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.amazon.in");
    	
       
       // Using verify (in TestNG or with soft assertions)
          SoftAssert softAssert = new SoftAssert();
          System.out.println(driver.getTitle());
          softAssert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

          // Continue with other steps even if the above verification fails
          softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

          // Collect all verification results
          softAssert.assertAll();
           Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

          driver.quit();

    
        
    }
 
}
