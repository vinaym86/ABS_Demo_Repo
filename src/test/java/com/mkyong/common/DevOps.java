
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DevOps {
	public WebDriver driver;
	
  
  public void setup() throws InterruptedException {
	/* System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver"); //sets the system property to the IE driver. Download from( http://www.seleniumhq.org/download/)
	 
	  driver.manage().window().maximize(); //Maximize the window
	  driver.get("https://www.google.co.in"); //enters this URL and navigates
	  System.out.println("Browser Launched");
	  Thread.sleep(5000); //waits for 10 seconds
  	  System.out.println("Setup Completed and title");  	*/    
//WebDriver DRIVER = new ChromeDriver();
	  driver = new FirefoxDriver();
driver.get("http://www.google.com");	  
	  
  }
	
	public static void main(String[] args) throws InterruptedException {
		DevOps devops = new DevOps();
		devops.setup();
		devops.driver.quit();

	}

}
