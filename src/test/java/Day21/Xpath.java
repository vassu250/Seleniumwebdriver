package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
//X-pah with single att
//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("amazon"); // Searchbox-insepect-selectorhub-findx path
//X-pah with multiple att
//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("flipkart");
//X-pah with and or att

//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("flipkart");
driver.findElement(By.xpath("//input[@name='search' or @placeholder='abc']")).sendKeys("amazon");

	}

}
