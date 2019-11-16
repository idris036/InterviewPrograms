package com.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollUpAndDown {
	public static WebDriver driver;
	
	//Write a Java Program to demonstrate Scroll up/ Scroll down.

	public static void main(String[] args) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");

	}

}
