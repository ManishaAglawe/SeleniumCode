package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute_PaymentPage {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/payments/");
		WebElement cardname=driver.findElement(By.id("(//input)[2]"));
		cardname.sendKeys("aglawemanisha");
	}

}
