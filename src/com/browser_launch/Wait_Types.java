package com.browser_launch;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait // Global 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		
		//Explicit Wait // Local
		WebElement amazon = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
		
		WebDriverWait w=new WebDriverWait(driver, 50);
		
		w.until(ExpectedConditions.visibilityOf(amazon));
		
		
		//Fluent Wait // frequency of interval
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				
	
	}

}
