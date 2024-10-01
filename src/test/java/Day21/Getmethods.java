package Day21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle()return title of the page
		System.out.println(driver.getTitle());		//returns orange hrm
		System.out.println(driver.getCurrentUrl());//returns url
		//System.out.println(driver.getPageSource());//use if we want to see the elements on vewsource
		//String windowid=driver.getWindowHandle(); // id of browser window
	//	System.out.println(windowid);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//opens new browser window
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
	}

}
