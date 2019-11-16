package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConditionCheck {
	
	public static WebDriver driver;

	//Write a Java Program to demonstrate explicit wait condition check.
	
	public static void main(String[] args) 
	{
		WebElement ele = driver.findElement(By.xpath(".//input[@id='123']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 12);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		

		
	}

}
