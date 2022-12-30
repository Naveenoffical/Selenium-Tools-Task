package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepam\\eclipse-workspace\\Testing" + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9061914%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAjs2bBhACEiwALTBWZQHDwzu0zyx5ULiwK0PQkwZTJYtW9hrKWR293Uth-8UHcnWQTMBOgRoCHU0QAvD_BwE");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select s = new Select(day);
		s.selectByIndex(2);
		WebElement day1 = driver.findElement(By.id("month"));
		Select s1 = new Select(day1);
		s1.selectByValue("8");
		WebElement day3 = driver.findElement(By.id("year"));
		Select S3 = new Select(day3);
		S3.selectByIndex(24);

		

	}

}
