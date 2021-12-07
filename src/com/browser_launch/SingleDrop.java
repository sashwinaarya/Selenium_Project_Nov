package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select s=new Select(singledrop);
		
		s.selectByIndex(1);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByValue("3");
		s.deselectByValue("3");
		Thread.sleep(2000);
		
		
	}

}
