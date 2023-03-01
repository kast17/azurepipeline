package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Actions.BasePage;
import Actions.BasePage2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Runner {
	
	
	WebDriver driver;
	
	@Test
	
	public void testrunner() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		BasePage page = new BasePage(driver);
		BasePage2 page2= new BasePage2(driver);
		page.Navigate_to_URl().Assert_logo().Type_FullNameandLastName().Select_Gender().onlyone_dropdown();
		page2.multipledropdown().multipledropdown().select_mutlipleoptions().color_picker().Close_Driver();
	
	}

	
	
}
