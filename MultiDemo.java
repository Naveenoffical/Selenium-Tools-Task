package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing"
				+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
     	WebElement d1 = driver.findElement(By.id("dropdown1"));
     	Select s = new Select(d1);
     	s.selectByIndex(1);
     	WebElement d2 = driver.findElement(By.name("dropdown2"));
     	Select s1 = new Select(d2);
     	System.out.println(s1.isMultiple());
     	List<WebElement> options = s1.getOptions();
     	for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals("selenium")||webElement.getText().equals("Loadrunner"));
	
     	webElement.click();
     	}
     	System.out.println("-----------------");

     	WebElement first = s1.getFirstSelectedOption();
     	String text = first.getText();
     	System.out.println(text);
		
     	System.out.println("----------------------");
	
     	List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();{
     		for (WebElement webElement : allSelectedOptions) {
     			String text2 = webElement.getText();
     			System.out.println(text2);
				
			}

     		
     		
			
		}
			
		}}
     	
     
     