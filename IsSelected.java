package Methods_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/is-selected/");
		WebElement e1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		e1.click();
	    Thread.sleep(2000);
	    boolean b1=e1.isSelected();
	    System.out.println(b1);
	    
		
     
	}

}
