/*package task;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MMdropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing"
				+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s = new Select(fruit);
		s.selectByIndex(1);
		WebElement tree = driver.findElement(By.id("lang"));
		Select s1 = new Select(tree);
		System.out.println(s1.isMultiple());
		System.out.println("===========================");
		List<WebElement> options = s1.getOptions();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}*/
