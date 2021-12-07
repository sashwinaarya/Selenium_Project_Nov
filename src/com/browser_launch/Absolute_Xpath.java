package com.browser_launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=iphone&i=black-friday&crid=3HIGJITTUSWBT&sprefix=iph%2Cblack-friday%2C600&ref=nb_sb_ss_ts-doa-p_1_3");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='search']/div/div/div/span[3]/div[2]/div/div/span/div/div/div[2]/div/div/div/span/a/div/img")).click();
		
	}

}
