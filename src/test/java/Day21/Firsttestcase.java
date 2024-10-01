package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
public class Firsttestcase {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();  //import package org           chrome driver is class webdriver is interface.
		driver.get(" https://www.google.com/");   //get method
		
		String act_title=driver.getTitle();
		if(act_title.equals("Google"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test fail");
		}
driver.close();
	}

}
