package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Felement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing"
				+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.name("email"));
		String text = name.getText();
		System.out.println(text);
		WebElement pass = driver.findElement(By.name("pass"));
		boolean displayed = pass.isDisplayed();
		System.out.println(displayed);
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		pass.sendKeys("naveen");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pass.clear();
		
		
		
		
		
		
		
	}
	

}
