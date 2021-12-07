package com.selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1.click();
		String text = frame1.getText();
		
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondframe_click = driver.findElement(By.xpath("//button[@id='Click1']"));
		secondframe_click.click();
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println("Frame Size: " +size);
		
	}

}
