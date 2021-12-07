package com.browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.manage().window().maximize();

		WebElement index = driver.findElement(By.xpath("//select[@id='dropdown1']"));

		Select s = new Select(index);

		WebElement multidropdown = driver.findElement(By.xpath("(//select)[6]"));

		Select multidd = new Select(multidropdown);

		List<WebElement> multidd_values = multidd.getOptions();

		System.out.println("-------------------- List ----------------------");

		// for(datatype eachitem:array name)

		for (WebElement i : multidd_values) {

			System.out.println(i.getText());

		}

		int size2 = multidd_values.size();

		System.out.println("Multi DD Size: " + size2);

		for (int i = 0; i < size2; i++) {
			if (i == 3 | i == 2 | i == 1)

			{
				multidd.selectByIndex(i);
				Thread.sleep(2000);
				multidd.deselectAll();

			}

		}
		

	}

}
