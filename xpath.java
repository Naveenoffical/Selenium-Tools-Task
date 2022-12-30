package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepam\\eclipse-workspace\\Testing"
			+ "\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hotstar.com/in");
	driver.manage().window().maximize();
	WebElement movies = driver.findElement(By.xpath("//div[text()='Movies']"));
	movies.click();
	Thread.sleep(2000);
	driver.navigate().back();
	WebElement sports = driver.findElement(By.xpath("//div[text()='Sports']"));
	sports.click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.xpath("//div[text()='Disney+']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	WebElement id = driver.findElement(By.id("searchField"));
	id.sendKeys("Star vijay");
	Thread.sleep(2000);
	driver.navigate().back();
	
	
}
}
