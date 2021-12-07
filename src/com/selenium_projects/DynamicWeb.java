package com.selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWeb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		// To find third row of table
		WebElement rw = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]"));
		String rowtext = rw.getText();
		System.out.println("Third row of table : " + rowtext);

		// to get 3rd row's 2nd column data
		WebElement col = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"));
		String valueIneed = col.getText();
		System.out.println("Cell value is : " + valueIneed);
		// wd.close();

	}

}
