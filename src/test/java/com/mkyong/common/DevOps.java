
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DevOps {
	public WebDriver driver;
	
  
  public void setup() throws InterruptedException {
	 // System.setProperty("webdriver.ie.driver", "D:\\vk00418361\\IEDriverServer.exe"); //sets the system property to the IE driver. Download from( http://www.seleniumhq.org/download/)
	  /*driver = new FirefoxDriver();
	  driver.manage().window().maximize(); //Maximize the window
	  driver.get("https://www.google.co.in"); //enters this URL and navigates
	  System.out.println("Browser Launched");
	  Thread.sleep(5000); //waits for 10 seconds
  	  System.out.println("Setup Completed and title");  */	    
WebDriver DRIVER = new FirefoxDriver();
DRIVER.get("http://www.google.com");	  
	  
  }
	
	public static void main(String[] args) throws InterruptedException {
		DevOps devops = new DevOps();
		devops.setup();
		devops.driver.quit();

	}

}
