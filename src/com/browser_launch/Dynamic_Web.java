package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		WebElement rw = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[5]"));
		System.out.println(rw.getText());
		
		WebElement specific_Data = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[5]/td[3]"));
		System.out.println(specific_Data.getText());
		
		
		
	}

}
