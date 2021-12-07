package com.browser_launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement today_deal = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		a.contextClick(today_deal).build().perform();
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		WebElement customer_service = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		a.contextClick(customer_service).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick(registry).build().perform();
		
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//number of windows opened
		int size = driver.getWindowHandles().size();
		System.out.println("Window Size: " +size);
		
		//printing parent id alone
		String parentid = driver.getWindowHandle();
		System.out.println("parentid: " +parentid);
		
		//get all window title
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String t:allwindow) {
			
			String title = driver.switchTo().window(t).getTitle();
			System.out.println("Titles: " +title);
		}
		
		
		//redirect to specific child
		
		//child title
		
		//for each with allwindow
		
		//if condition
		
		//Amazon.com. Spend less. Smile more. == Amazon.com Help: Help --> False
		
		//Amazon Registry & Gifting == Amazon.com Help: Help--> false
		
		//Amazon.com Help: Help == Amazon.com Help: Help---> True
		
		/*
		 * String child="Amazon.com Help: Help";
		 * 
		 * for(String eachitem:allwindow) {
		 * 
		 * if(driver.switchTo().window(eachitem).getTitle().equalsIgnoreCase(child)) {
		 * 
		 * break; }
		 * 
		 * }
		 */
			
		
		/*
		 * //close only my parent window for(String c:allwindow) {
		 * 
		 * //today_deal != parentid? --> yes --> close() //parent window != parentid?
		 * --> No --> it will not close
		 * 
		 * if(!c.equals(parentid)) {
		 * 
		 * driver.switchTo().window(c); driver.close();
		 * 
		 * }
		 * 
		 * }
		 */
		
		for(String notclose_p:allwindow) {
			
			if(!notclose_p.equals(parentid)) {
				
				driver.switchTo().window(notclose_p).close();
				
			}
			
			
		}
		
		
		
	}

}
