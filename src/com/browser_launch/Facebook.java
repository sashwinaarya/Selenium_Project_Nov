package com.browser_launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title: " +title);
		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot) driver; // narrowing
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Screenshot\\FaceBook.jpg");
		FileUtils.copyFile(source, Destination);
		
	}

}
