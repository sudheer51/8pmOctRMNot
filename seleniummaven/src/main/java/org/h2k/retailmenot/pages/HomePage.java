package org.h2k.retailmenot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	/**
	 * Open the Application
	 */
	public void openApp()
	{
		driver.get("https://www.retailmenot.com");
	}
	/**
	 * Navigate to the new year deals page
	 * 
	 */
	public void navigateToPage(String linkText)
	{
									 	//"+linkText+"  "+dealName+"
		//Click on New Year Deals link
		driver.findElement(By.xpath("//a/span[text()='"+linkText+"']")).click();
	}
}
