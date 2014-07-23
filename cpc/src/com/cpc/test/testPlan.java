package com.cpc.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cpc.main.commonFunctions;
import com.cpc.main.loginPage;
import com.thoughtworks.selenium.Selenium;

public class testPlan {
	
	static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://glms-lt.cisco.com/Saba/Web/PerformanceAdmin");
		
		}
	//Happy Path Year end
	@Test
	public static void login() throws InterruptedException{
		
		commonFunctions bp = new commonFunctions(driver);
		bp.login("ssardar" , "welcome");
		
		bp.navigateToTeamHome();
		
		bp.navigateToTeamReviews();
		driver.findElement(By.xpath("//input[contains(@value, 'Pathak Anuj')]")).click();  // to check the checkbox
		driver.findElement(By.xpath("//a[@title='Assign Proxy']")).click();
		driver.findElement(By.xpath("//*[@id='personInput']")).sendKeys("abc");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[contains(text(), 'Abhishek Chadha  (ABCHADHA)')]")
		
				
		driver.findElement(By.xpath("//li[contains(text(), altMgr)]")).click();	
		driver.findElement(By.xpath("//a[@title='Assign Proxy']")).click();
		
		bp.clkEmpName("Pathak Anuj");
		
		bp.rtnRevToEmp();
		bp.popupCancel();
		
		//driver.findElement(By.xpath("//*[@title = 'Return To Employee']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
	}

}
