package LuanchingBrowsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Global issues"); //by using findElement we can find the element present on webpage
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);//name is locator 
		//driver.findElement(By.className("FMKtTb UqcIvb bSsRe"));
		
		
		

	}

}
