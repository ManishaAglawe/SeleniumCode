package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Link_PartialLinkText 
{
    public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			WebElement mobile=driver.findElement(By.linkText("Mobiles"));
			mobile.click();
			WebElement Customer_Service=driver.findElement(By.linkText("Customer Service"));
			Customer_Service.click();
			

	}

}
