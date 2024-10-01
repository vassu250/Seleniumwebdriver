package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/marketplace");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("amazon");
	}

}
