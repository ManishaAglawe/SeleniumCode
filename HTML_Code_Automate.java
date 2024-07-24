package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HTML_Code_Automate 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mahesh/Desktop/learningHTML1.html");
		WebElement username=driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Manisha");
		WebElement Hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		Hint.sendKeys("Code");
		WebElement Pass=driver.findElement(By.xpath("(/html/body/input)[3]"));
		Pass.sendKeys("12345");
		WebElement FirstName=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		 FirstName.sendKeys("Manisha");
		// WebElement LastName=driver.findElement(By.xpath("(/html/body/form/input)[2]"));// exception:ElementNotInteractableExceptio
		// LastName.sendKeys("Aglawe");
		 WebElement Boy=driver.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
		 Boy.click();
		 WebElement Girl=driver.findElement(By.xpath("((html/body/form)[2]/input)[2]"));
		 Girl.click();
		 WebElement Baby=driver.findElement(By.xpath("((html/body/form)[2]/input)[3]"));
		 Baby.click();
		 WebElement Link_grotech=driver.findElement(By.linkText("Click to know about us"));
		 Link_grotech.click();
		
		
		
	}

}
