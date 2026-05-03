package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class PageClass {
	
	static WebDriver driver;
	
	PageClass(WebDriver driver){
		this.driver = driver;
	}
	
	 PageClass(WebDriver driver,String Test) {
        this.driver = driver;
        PageFactory.initElements(driver, this);   // this is how driver is “connected”
    }
	
	 static By username =  By.xpath("//*[@id = \"nameInput\"]");
	  
	 
	public static void sendInput() {
		driver.findElement(username).sendKeys("test");
	}
	
	public static String sendAttributeValue() {
		return driver.findElement(username).getAttribute("value");
	}
	
	
	@FindBy(xpath = "//*[@id = \"nameInput\"]")
	static WebElement usernamef;
	
	
	
	public static void sendData() {
		usernamef.sendKeys("PageFactory");
	}
	public static String sendAttributeValuef() {
		return usernamef.getAttribute("value");
	}
	

}
