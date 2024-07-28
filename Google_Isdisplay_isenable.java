package Methods_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Isdisplay_isenable {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail_link=driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
		System.out.println(gmail_link.isDisplayed());
		System.out.println(gmail_link.isEnabled());
		gmail_link.click();

	}

}
