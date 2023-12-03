# webDriverSample
token: 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\
toke-2: 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
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
package GooglePageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GooglePageTest {

	public static void main(String[] args){
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
// driver.get("https://www.google.com/"); 
// WebElement srcBox= driver.findElement(By.id("APjFqb"));
// srcBox.sendKeys("java tutorial");
// srcBox.sendKeys(Keys.ENTER);
// System.out.println("title "+ driver.getTitle());
// System.out.println("URL "+ driver.getCurrentUrl());
// driver.get("https://www.google.com/"); 
//		 WebElement srcBox= driver.findElement(By.id("APjFqb"));
//		 srcBox.sendKeys("java tutorial");
//		 Thread.sleep(2000);		
//		 List<WebElement> listItems= driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
//		 System.out.println("total items : " + listItems.size());
//		 for(int i=0;i<listItems.size();i++) {
//			 System.out.println(listItems.get(i).getText());
//			 if(listItems.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
//				 listItems.get(i).click();
//				 break;
 
// 
// 	driver.get("https://the-internet.herokuapp.com/login");
// 	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
// 	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
// 	//driver.findElement(By.className("radius")).click();
// 	driver.findElement(By.cssSelector("button.radius")).click();
// 	//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
// 	
// 	driver.findElement(By.linkText("Elemental Selenium")).click();
// 	String strUrl= driver.findElement(By.linkText("Elemental Selenium")).getAttribute("href");
// 	System.out.println(strUrl);
// 	
// 	
 	//display text
 	
// driver.get("https://automationbookstore.dev/");
// //driver.findElement(By.id("searchbar")).sendKeys("test");
// String strPlaceHolder= driver.findElement(By.id("searchBar")).getAttribute("placeholder");
// System.out.println(strPlaceHolder);
// WebElement closeIcon= driver.findElement(By.cssSelector("a[title = 'Clear text']"));
// 		System.out.println(closeIcon.isDisplayed());
//		if(closeIcon.isDisplayed())
//		{
//			closeIcon.click();
//			
//			
//		}
// 
 
// //ChkRadiotest
// driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
// WebElement age =driver.findElement(By.id("isAgeSelected"));
// if(!age.isSelected()) {
//	 age.click();
//	 
// }
// driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
// //Radiobutton
// driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
// driver.findElement(By.xpath("//input[@value= '5 - 15']")).click();
// 
 
 //Dropdowntest
driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
Select singlSel= new Select(driver.findElement(By.id("select-demo")));
singlSel .selectByValue("Tuesday");
Select multiSel= new Select(driver.findElement(By.id("multi-select")));
if(multiSel.isMultiple()) {
	multiSel.selectByIndex(0);
	multiSel.selectByValue("Florida");
	multiSel.selectByVisibleText("Washington");
	
}


	}
 
 }


