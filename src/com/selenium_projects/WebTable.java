package com.selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		System.out.println("-----------All data---------------");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement all:alldata) {
			System.out.println(all.getText());
			
		}
		System.out.println("-----------Particular Row-----------");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for(WebElement row:rowdata) {
			
			System.out.println(row.getText());
		}
		
		
		System.out.println("--------Particular Column----------");
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for(WebElement column:columndata) {
			
			System.out.println(column.getText());
		}
		
		System.out.println("----------------- Particular data-----------");
		
		WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		
		System.out.println(particular_data.getText());
		
		System.out.println("-----------Size -------------------");
		
		List<WebElement> header = driver.findElements(By.tagName("th"));
		
		int size = header.size();
		System.out.println("Header Size: " +size);
		
		List<WebElement> rowsize = driver.findElements(By.tagName("tr"));
		
		int size2 = rowsize.size();
		System.out.println("Row Size: " +size2);
		
		WebElement follow = driver.findElement(By.xpath("//td[normalize-space()='Learn Locators']//following::td[4]"));
		System.out.println(follow.getText());
		
		
	}

}
