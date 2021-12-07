package com.selenium_projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handles {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement deal = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		a.contextClick(deal).build().perform();
		Thread.sleep(2000);
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		WebElement customer = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		a.contextClick(customer).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);		
		
		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick(registry).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);	
		
		WebElement gft = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		a.contextClick(gft).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);	
		
		int size = driver.getWindowHandles().size();
		System.out.println("Window Size: " +size);
		
		System.out.println("-------------------------");
		
		String parentid = driver.getWindowHandle();
		System.out.println("parentid: " +parentid);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String title:allwindow) {
			
			String titlename = driver.switchTo().window(title).getTitle();
			System.out.println(titlename);
			
			
		}
		
		//specific child window
		
		 String child="Amazon.com Help: Help";
		  
		  for(String eachitem:allwindow) {
		  
		  if(driver.switchTo().window(eachitem).getTitle().equalsIgnoreCase(child)) {
		  break; }
		  
		  }
		 
		
		
//		//except parent window closing child
//		
//		for(String c:allwindow) {
//			
//			
//			if(!c.equals(parentid)) {
//				
//				driver.switchTo().window(c);
//				driver.close();
//			}
//			
//		}

		  

		
		
	}

}
