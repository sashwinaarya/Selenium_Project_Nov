package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRobot_Drag {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		//Source
		WebElement source = driver.findElement(By.id("draggable"));
		
		//destination
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		//a.clickAndHold(source).moveToElement(destination).build().perform();
		
		a.dragAndDrop(source, destination).build().perform();
		
		
		
	}

}
