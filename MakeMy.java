package task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepam\\eclipse-workspace\\Testing" + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Make my trip");
		driver.findElement(By.name("btnK")).click();
		List<WebElement> trip = driver.findElements(By.xpath("//a[@class=\"l\"]"));
		for (WebElement webElement : trip) {Thread.sleep(10000);
			webElement.click();
			Thread.sleep(6000);
			System.out.println("The url of page "+driver.getCurrentUrl()+"====="+"The Title is "+driver.getTitle());
			driver.navigate().back();

		}

	}

}
