package Methods_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_IsEnable_HTML_Code {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mahesh/Desktop/learningHTML1.html");
		WebElement e1=driver.findElement(By.id("121"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());

	}

}
