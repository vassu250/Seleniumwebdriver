package Day21;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();//import package org           chrome driver is class webdriver is interface.
		driver.get(" https://demo.opencart.com/");   //get method
		driver.manage().window().maximize(); // to maximize chrome window
		//name
	/*	driver.findElement(By.name("search")).sendKeys("amazon");
		
		//id
		boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed(); //if lofo is availsble display true
		System.out.println(logodisplaystatus);
		//link text, partial link test- no need to pass full name
		driver.findElement(By.linkText("Tablets")).click(); //findelement - to find single webelements
		
		driver.findElement(By.partialLinkText("Tab")).click();
		//Class name
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("total no of links:"+headerLinks.size());
		*/
		//Tag name
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());

	}

}
