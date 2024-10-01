package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
/* open application
 * test logo presence
 * login
 * close
 */
public class OrangeHRMtest {
	WebDriver driver;
  @Test(priority=1)
  void openapp() {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
  }
  @Test(priority=2)
  void testlogo() throws InterruptedException {
	  Thread.sleep(3000);
	 boolean sts= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo displayed"+sts);
	  
  }
  @Test(priority=3)
  void login() throws InterruptedException {
	  Thread.sleep(3600);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
  }
  @Test(priority=4)
  void logout() {
	  driver.quit();
  }
}
