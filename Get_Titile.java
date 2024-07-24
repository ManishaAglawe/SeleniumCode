package LuanchingBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Titile {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}
