import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class EbayAdvancedSearch {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
	}

	@Test
	public void testEbayAdvancedSearch() throws Exception {
		driver.get("http://www.google.com");	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}
}
