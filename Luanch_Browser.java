package LuanchingBrowsers;
import org.openqa.selenium.chrome.ChromeDriver;
public class Luanch_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver1=new FirefoxDriver();
		//EdgeDriver driver2=new EdgeDriver();
       driver.get("https://www.amazon.in");
       Thread.sleep(5000);
       driver.manage().window().maximize();
       driver.manage().window().minimize();
       driver.close();
      // driver.quit();   
       
     
	}

}
