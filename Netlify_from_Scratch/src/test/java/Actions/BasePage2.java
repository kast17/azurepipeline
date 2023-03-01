package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage2 {
	WebDriver driver;
	By dropdown_multiple = By.xpath("//select[@id='owc']");
	By color = By.xpath("//input[@id='favcolor']");
	

	public BasePage2(WebDriver driver) {
		this.driver = driver;
	} 

	
	
	public BasePage2 multipledropdown() throws InterruptedException {
		Select select1 = new Select(driver.findElement(dropdown_multiple));
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.selectByIndex(3);
		
		return this;
	}
	
	public BasePage2 select_mutlipleoptions() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[6]"));
		
		return this;
	}
	
	public BasePage2 color_picker() throws InterruptedException {
		driver.findElement(color).click();
		for(int i=0;i<3;i++) {
			
			driver.findElement(color).sendKeys(Keys.TAB);	
		}	
		Thread.sleep(3000);
		return this;
	}
	
	
	public BasePage2 Close_Driver() {
		
		driver.close();
		return this;
	
	}
	
}
