package com.browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();		
		
		//all data
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement all:alldata) {
			
			System.out.println(all.getText());
		}
		
		//header
		
		System.out.println("---------- Header ----------------");
		
		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr/th"));
		
		
		for(WebElement head:header) {
			System.out.println(head.getText());
		}
		
		//row data
		System.out.println("------------- ROW DATA ------------------");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		
		
		for(WebElement rw:rowdata) {
			
			System.out.println(rw.getText());
			
		}
		//column data
		System.out.println("---------- Column Data -------------");
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		for(WebElement col:column_data) {
			
			System.out.println(col.getText());
		}
		//particular data
		System.out.println("---------------------Particular data---------------");
		
		WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]"));
		System.out.println(particular_data.getText());
		
		//row size
		System.out.println("------------- Row Size------------");
		
		List<WebElement> rowsize = driver.findElements(By.tagName("tr"));
		
		int row_size = rowsize.size();
		
		System.out.println("row_size: " +row_size);
		//column size
		System.out.println("------------- Column Size ---------------");
		
		List<WebElement> colsize = driver.findElements(By.tagName("td"));
		int col_size = colsize.size();
		System.out.println(col_size);
		//following
		WebElement follwing = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[4]"));
		System.out.println(follwing.getText());
		
	}

}
