package Methods_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement e1=driver.findElement(By.name("gender"));
		e1.click();
		 Thread.sleep(2000);
		 boolean b1=e1.isSelected();
		    System.out.println(b1);

	}

}
