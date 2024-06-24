package ParallelTestSeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
  @Test
  public void testGridSetup() throws MalformedURLException, InterruptedException
  {
	  ChromeOptions options=new ChromeOptions();
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);
	  
	  System.out.println("Remote connection establish with Chrome!");
	  
	  Thread.sleep(4000);
	  
	  driver.get("https://www.amazon.in");
	  
	  Thread.sleep(10000);
	  
	  System.out.println("Application will launch : "+driver.getCurrentUrl());
	  
	  driver.quit();
	  
	  System.out.println("Server connection closed!");
	  
	  
	  
	  
	  
	  
  }
}
