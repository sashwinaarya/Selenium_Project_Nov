package com.selenium_projects;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RbClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension d=new Dimension(1000, 1000);
		driver.manage().window().setSize(d);
		
		//Actions
		Actions a=new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		//a.dragAndDrop(source, destination).build().perform();
		
		a.clickAndHold(source).moveToElement(destination).build().perform();

		
		

		
	}

}
