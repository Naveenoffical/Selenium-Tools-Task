package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobileTask {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing"
				+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	    search.sendKeys("poco x3pro");
	    
	    
	   Robot rt = new Robot();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    rt.keyPress(KeyEvent.VK_ENTER);
	    rt.keyRelease(KeyEvent.VK_ENTER);
	    List<WebElement> mobile = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    for (WebElement webElement : mobile) {
	    	String text = webElement.getText();
			System.out.println(text);
		}
 	
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}


