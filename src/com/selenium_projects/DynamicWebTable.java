package com.selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();		
		
		//all data
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
		
		for (int i = 0; i < alldata.size(); i++) {
			
			if(alldata.get(i).getText().equalsIgnoreCase("Learn Locators")) {
				
				System.out.println(rowdata.get(i+4).getText());
			}
			
			
		}
		
		
		
	}
	
}
