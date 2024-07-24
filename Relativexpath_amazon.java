package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath_amazon {

	public static void main(String[] args) 
	{
		    ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			WebElement amazon=driver.findElement(By.className("(//span)[16]"));
			amazon.click();
			
	}

}
