package NavigationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement First_name=driver.findElement(By.id("fname"));
		First_name.sendKeys("manisha");	
		WebElement Last_name=driver.findElement(By.id("lname"));
		Last_name.sendKeys("Aglawe");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("aglawemanisha12@gmail.com");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("password");
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
