package com.cpc.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class commonFunctions {
	
	protected static WebDriver driver;







public commonFunctions(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}




public static void login(String username, String password){
	
	driver.findElement(By.tagName("frame"));
	driver.switchTo().frame(0);
	
	driver.findElement(By.id("id1005")).sendKeys(username);
	driver.findElement(By.id("id1006")).sendKeys(password);
	
	
	driver.findElement(By.xpath("//a[@title = 'Log In']")).click();
}

public static void logout(){
	
	
}

/*** From employee Home Page ***/

//My Plans
//My Mid-Year Discussions
//My Reviews
//Browse and Search
//Goals
//My Journal
//Click to Chat
//CPC Website
//Support
//provide feedback
//about CPC tool

/*** Team Home **/

public static void navigateToTeamHome(){
	driver.findElement(By.linkText("Team Home")).click();
}

public static void navigateToTeamReviews(){
	
	driver.findElement(By.xpath("//*[contains(@src, 'img_selected_3.png')]")).click();
	
}
//Select user from Team Home page

public static void clkEmpName(String username){
	driver.findElement(By.linkText(username)).click();
}

public static void rtnRevToEmp(){
	driver.findElement(By.xpath("//*[@title = 'Return To Employee']")).click();
}

public static void popupAccept(){
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

public static void popupCancel(){
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}
}