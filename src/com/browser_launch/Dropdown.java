package com.browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement singledrop = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select s=new Select(singledrop);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByValue("3");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Loadrunner");
		
		List<WebElement> all_dropdownvalue = s.getOptions();
		
		int size = all_dropdownvalue.size();
		
		System.out.println("Size of DD: " +size);
		
		WebElement multidropdown = driver.findElement(By.xpath("(//select)[6]"));
		
		Select multidd=new Select(multidropdown);
		
		boolean multiple = multidd.isMultiple();
		
		System.out.println("-------------------- Is Multiple or Not ----------------------");
		System.out.println(multiple);
		
		
		List<WebElement> multidd_values = multidd.getOptions();
		
		System.out.println("-------------------- List ----------------------");
		
		//for(datatype eachitem:array name)
		
		for(WebElement i:multidd_values) {
			
			System.out.println(i.getText());
			
		}
		
		int size2 = multidd_values.size();
		
		System.out.println("Multi DD Size: " +size2);
		
		
		for (int i = 0; i < size2; i++) {			
			if(i==4 | i==2 | i==10)
				
			{
				multidd.selectByIndex(i);
				
			}
			
		}
			System.out.println("---------------------Get All Selected -------------------------");
			
			List<WebElement> allSelectedOptions = multidd.getAllSelectedOptions();
		
			
			for(WebElement multi: allSelectedOptions) {
				
				System.out.println(multi.getText());
			}
		
	
		
			WebElement firstSelectedOption = multidd.getFirstSelectedOption();
			
			System.out.println(firstSelectedOption.getText());
		
		

		
		
	}

}
