package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Grotechmind_Form2
{
public static void main(String[] args)
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
	//WebElement female=driver.findElement(By.className("form-check"));
	//female.click();
	
	
	
}

}
