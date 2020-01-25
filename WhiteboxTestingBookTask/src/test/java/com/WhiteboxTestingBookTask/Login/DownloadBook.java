package com.WhiteboxTestingBookTask.Login;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DownloadBook {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aulak\\Desktop\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void DownloadBookApacheJmeter() throws IOException, InterruptedException
	{
		String parent=driver.getWindowHandle();
		driver.get("http://www.whiteboxqa.com");
		
		
		//Set<String>windows=driver.getWindowHandles();
		
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("username")).sendKeys("aulakhsim@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nar28@hm");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a")).click();
		//driver.findElement(By.className("books list-group-item material-category")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/aside/section/ul/div/a[6]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[7]/div/div/div/div/table/tbody/tr[1]/td[2]/a")).click();
		
	//	driver.navigate().to("/html/body/div[1]/div/div/div/div[2]/div[7]/div/div/div/div/table/tbody/tr[4]/td[2]/a");
		
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> itr = windowsId.iterator();
		
		String parentId=itr.next();
		String childId=itr.next();
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div[2]/div[2]/div[3]/div")).click();
		
		driver.close();
		
		driver.switchTo().window(parentId);
		
		driver.close();
		
	}
	

}
