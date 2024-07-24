package LuanchingBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Type_Shoes_Enter
{
   public static void main(String[] args) 
    {
	   ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);

	}

}
