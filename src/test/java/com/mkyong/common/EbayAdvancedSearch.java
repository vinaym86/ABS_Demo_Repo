import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class EbayAdvancedSearch {
	public WebDriver driver;

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
