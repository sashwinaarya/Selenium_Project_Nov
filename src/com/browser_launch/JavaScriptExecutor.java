package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver; // narrowing
		
		
		js.executeScript("window.scroll(0,3000)", ""); // down scroll
		
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,-2000)", "");//scroll up
		
		WebElement amazon = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
		
		amazon.click();
		
		js.executeScript("arguments[0].scrollIntoView(true)", amazon);
		
		js.executeScript("arguments[0].click()", amazon);

		
	}

}
