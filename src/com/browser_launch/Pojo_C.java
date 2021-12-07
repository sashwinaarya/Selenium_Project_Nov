package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo_C {
	
	public static void main(String[] args) throws InterruptedException {
	
		//Absolute xpath
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/s?k=iphones&i=black-friday&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='search']/div/div/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div/div/div/span/a/div/img")).click();
		
	}

}
