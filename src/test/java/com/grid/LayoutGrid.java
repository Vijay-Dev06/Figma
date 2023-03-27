package com.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LayoutGrid {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.diver", "C:\\Users\\vijay\\eclipse-workspace\\figma\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.figma.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vjkarthi143@gmail.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("current-password"));
		password.sendKeys("VJ9841298165");
		WebElement login1 = driver.findElement(By.xpath("//button[text()='Log in']"));
		login1.click();
		Thread.sleep(3000);
		WebElement newDesign  = driver.findElement(By.xpath("//div[text()='New design file']"));
		newDesign.click();
		Thread.sleep(2000);
		WebElement selFrame  = driver.findElement(By.xpath("//div[@data-testid='set-tool-frame']"));
		selFrame.click();
		WebElement canvas  = driver.findElement(By.tagName("canvas"));
		canvas.click();
		WebElement layoutgrid = driver.findElement(By.xpath("//div[text()='Layout grid']"));
		layoutgrid.click();
		
	}

}
