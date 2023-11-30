package GooglePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("https://www.google.com/");
 
 WebElement srcBox= driver.findElement(By.id("APjFqb"));
 srcBox.sendKeys("java tutorial");
 srcBox.sendKeys(Keys.ENTER);
  System.out.println("title "+ driver.getTitle());
  System.out.println("URL "+ driver.getCurrentUrl());
 
	}

}
