package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//opens new browser window
		Thread.sleep(5000);
	//	driver.close(); // close first single browseer window.
		driver.quit(); // close all windows
}
}
