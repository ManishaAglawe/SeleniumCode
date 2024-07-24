package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Grotechmind_RegisterForm {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement First_name=driver.findElement(By.name("firstName"));
		First_name.sendKeys("manisha");
		WebElement Last_Name=driver.findElement(By.id("lastName"));
		Last_Name.sendKeys("Aglawe");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Aglawe.manisha@gmail.com");
		WebElement phoneno=driver.findElement(By.name("phone"));
		phoneno.sendKeys("916784355");
		WebElement adharno=driver.findElement(By.name("aadhaar"));
		adharno.sendKeys("916780999999994355");
		WebElement panno=driver.findElement(By.name("pan"));
		panno.sendKeys("CKio097");
		//WebElement clickbutton=driver.findElement(By.id("checkbox"));
	    // clickbutton.sendKeys("CKio097");
		 WebElement Register=driver.findElement(By.linkText("Register"));
		 Register.click();

	}

}
