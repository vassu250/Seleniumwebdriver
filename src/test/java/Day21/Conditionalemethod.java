package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalemethod {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	driver.manage().window().maximize();

	//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//	System.out.println(logo.isDisplayed());
		   //    or
		// boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();    
	//	System.out.println(status);
		
		// is enabled
	//	 boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();    
	//		System.out.println(status);
		
		//is selected() Before selection both are false
	WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());
				System.out.println(female.isSelected());
	
				male.click(); // male true
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
	}

}
