package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_grotechmind {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(drop, drag).perform();
		

	}

}
