package ParallelTestSeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ParallelTest
{
	WebDriver driver;
	@Parameters({"browser"})
  @Test
  public void testGrid(String bname) throws MalformedURLException, InterruptedException
  {
	  
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions options=new ChromeOptions();
		  System.out.println("Chrome launched");
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);  

	  }else if(bname.equalsIgnoreCase("firefox"))
	  {
		  FirefoxOptions options=new  FirefoxOptions();
		  System.out.println("Firefox launched");
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);  
	 
	  }else if(bname.equalsIgnoreCase("edge"))
	  {
		  EdgeOptions options=new EdgeOptions();
		  System.out.println("Edge launched");
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);
		  
	  }
	  
	  Thread.sleep(4000);
	  driver.get("https://www.amazon.in");
	  
	  Thread.sleep(10000);
	  
	  
	  System.out.println("Title is: "+driver.getTitle());
	  driver.quit();
	  
	  
  }
}
