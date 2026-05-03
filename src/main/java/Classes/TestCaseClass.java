package Classes;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Point 1 : If real broswer is not available on machine then driver cannot be initiated of browser type 
        WebDriverManager.edgedriver().setup();
        //Point 2 : WebDriverManager auto downloads same version of driver which matches with actual browser
        WebDriver driver = new EdgeDriver();
        PageClass pc = new PageClass(driver);
        driver.get("file:///C:/Users/Shresha%20Reddy/Downloads/selenium-complete-practice.html");
        System.out.println(driver.getTitle());
        PageClass.sendInput();
        //Point 3 : To get value from text field use getAttribute instead of getText()
        System.out.println("First value"+PageClass.sendAttributeValue());
        driver.quit();
       
        /////Page Factory //////
      //Point 1 : If real broswer is not available on machine then driver cannot be initiated of browser type 
        WebDriverManager.edgedriver().setup();
        //Point 2 : WebDriverManager auto downloads same version of driver which matches with actual browser
        WebDriver driverf = new EdgeDriver();
        PageClass pcf = new PageClass(driverf,"test");
        driverf.get("file:///C:/Users/Shresha%20Reddy/Downloads/selenium-complete-practice.html");
        System.out.println(driverf.getTitle());
        pcf.sendData();
        //Point 3 : To get value from text field use getAttribute instead of getText()
        System.out.println("First value"+pcf.sendAttributeValuef());
        
        
        
        driverf.quit();


	}

}
