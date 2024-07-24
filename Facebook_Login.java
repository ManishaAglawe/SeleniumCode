package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));// By is one of the class in slenium which gives u the list of locators
		username.sendKeys("aglawe.manisha@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		
		
	
		
		

	}

}
