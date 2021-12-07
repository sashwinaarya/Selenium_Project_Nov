package com.browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Class {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1.click();
		
		String text = frame1.getText();
		System.out.println("Frame1: " +text);
		
		driver.switchTo().defaultContent();  // came to my parent window
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement frame2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frame_size = driver.findElements(By.tagName("iframe"));
		int size = frame_size.size();
		
		System.out.println("Frame size: " +size);
		
	}

}
