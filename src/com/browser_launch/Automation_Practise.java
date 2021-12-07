package com.browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practise extends Base_Class {
	
		public static WebDriver driver; //-- null
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		driver=getDriver("chrome"); // -- chrome driver
		
		//driver.get("http://automationpractice.com/index.php");
		 
		
		getUrl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		clickOnElement(signin);
		
		WebElement username = driver.findElement(By.id("email"));
		//username.sendKeys("Nandhinivaradhan@gmail.com");
		
		inputValueElement(username, "Nandhinivaradhan@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		//password.sendKeys("A@rya123");
		inputValueElement(password, "A@rya123");
		
		WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		//submit.click();
		clickOnElement(submit);
		
		close();
		
	}

}
