package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAtribute_Facebook {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("//input[@id='email']"));
		email.sendKeys("aglawe.manisha@gmail.com");
		WebElement pass=driver.findElement(By.id("//input[@id='pass']"));
		pass.sendKeys("218944");
		WebElement login=driver.findElement(By.id("//button[@id='loginbutton']"));
		login.click();
		
		
		

	}

}
