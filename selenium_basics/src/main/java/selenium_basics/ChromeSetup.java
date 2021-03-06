package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.DiscreteDomain;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ChromeSetup {

	final private static String url = "https://www.php.net/manual/en/tutorial.firstpage.php";
	public static void main(String[] args) {
		//cofig chrome 
		WebDriverManager.chromedriver().setup();
		//open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
//		WebElement pageIcon = driver.findElement(By.id("icon"));
//		pageIcon.click();
		
//		WebElement email = driver.findElement(By.id("inputEmail"));
//		email.sendKeys("test@123.com");
		
//		WebElement features = driver.findElement(By.xpath("//span[normalize-space()='Features']"));
//		WebElement mainFeatures = driver.findElement(By.xpath("//a[normalize-space()='Main Features']"));
//		features.click();
//		mainFeatures.click();
		
//		driver.get("https://www.php.net/manual/en/tutorial.firstpage.php");
		
		WebElement langDropdown =  driver.findElement(By.id("changelang-langs"));
		Select s = new Select(langDropdown);
		s.selectByVisibleText("French");
		
		driver.quit();
		
		
	}
}
