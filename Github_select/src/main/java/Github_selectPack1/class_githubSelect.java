package Github_selectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class_githubSelect {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search_box=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search_box.sendKeys("jackets");
		Thread.sleep(2000);
		WebElement search_icon=driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		search_icon.click();
		
	}

}
