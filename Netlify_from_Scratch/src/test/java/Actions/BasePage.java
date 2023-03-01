package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	
	
	By Logo = By.xpath("//h1[normalize-space()='Your Website to practice Automation Testing']");	 
	By First_Name = By.xpath("//input[@id='fname']");
	By radio_button = By.xpath("//input[@id='other']");
	By dropdown_one = By.xpath("//select[@id='option']");
	By dropdown_multiple = By.xpath("//select[@id='owc']");

	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;	
	}
	
	public BasePage Navigate_to_URl() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		Thread.sleep(2000);
		return this;
	}
	
	public BasePage Assert_logo() {
		Boolean output = driver.findElement(Logo).isDisplayed();
		WebElement Logo_element = driver.findElement(Logo);
		String text = Logo_element.getText();
		try{
			Assert.assertEquals(text,"Your Website to practice Automation Testing");
		}
		catch (Exception e) {
			System.out.println("wrong Logo");
			driver.close();
		}
		return this;
	}
	
	public BasePage Type_FullNameandLastName() {
		driver.findElement(First_Name).click();
		driver.findElement(First_Name).sendKeys("Kausthub");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("SCB");
		return this;
	}
	
	
	public BasePage Select_Gender() {
		
		driver.findElement(radio_button).click();
		return this;
	}
	
	public BasePage onlyone_dropdown() throws InterruptedException {
		
		/**
		 * The following code is for selecting one value from multiple drop down values
		 */
		
		Select select = new Select(driver.findElement(dropdown_one));
		select.selectByIndex(1);
		return this;
	}
	

	

	
	public BasePage Close_Driver() {
		
		driver.close();
		return this;
	
	}
	
	
	
	
	
	
	
	

}













