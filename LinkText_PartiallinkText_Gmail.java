package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartiallinkText_Gmail {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			//WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
			WebElement gmail_link=driver.findElement(By.partialLinkText("Gma"));
			gmail_link.click();
		

	}

}
