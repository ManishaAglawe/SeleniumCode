package LuanchingBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Luanch_Url {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle()); // return type is String
		System.out.println(driver.getWindowHandles());// return type is set<String>
       
	}

}
