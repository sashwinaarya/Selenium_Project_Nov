package com.selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsp_Executor {
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scroll(0,2000)","");
	

	Thread.sleep(3000);
	
	js.executeScript("window.scroll(0,-2000)", "");

	WebElement fb = driver.findElement(By.xpath("(//a[@class='_1arVWX'])[19]"));
	JavascriptExecutor j=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", fb);
	j.executeScript("arguments[0].click();", fb);
	
	
	
}

}
