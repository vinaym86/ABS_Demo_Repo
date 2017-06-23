import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;*/
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class EbayAdvancedSearch {
 WebDriver driver;
WebDriver driver = new FirefoxDriver;	
	@Test
	public void testEbayAdvancedSearch() throws Exception {
		driver.get("http://www.google.com");	
	}
	driver.quit();
}
