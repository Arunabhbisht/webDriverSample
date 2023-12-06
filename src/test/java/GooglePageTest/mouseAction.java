package GooglePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions action=new Actions(driver);
		
driver.get("https://stqatools.com/demo/DoubleClick.php");
Thread.sleep(1000);
WebElement btn= driver.findElement(By.xpath("//button[text()'Click Me/ Double Click Me']"));
action.doubleClick(btn).perform();
//action.doubleClick(btn)..doubleClick(btn).perform();
	}

}
