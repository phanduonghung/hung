package iso.edu.vn.Lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	@Test
	public void testSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "http://google.com";
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.name("q")).sendKeys("youtube channel hung phan ");
		WebElement element = driver.findElements(By.name("btnK")).get(1);
		Actions actions = new Actions(driver).click(element);
		actions.build().perform();
	}
}
