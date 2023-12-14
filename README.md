# webDriverSample
token: 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\
toke-2: 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
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


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
https://github.com/Arunabhbisht/webDriverSample.git



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


base

package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	private static TestBase testBase;
	private static WebDriver driver;
	private static Properties properties;
	
	private TestBase()
	{
		String strbrowser= "chrome";
		if (strbrowser.equalsIgnoreCase("chrome"))
				{
				driver =new ChromeDriver();
				
				}
		else if (strbrowser.equalsIgnoreCase("edge")){
			driver =new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	public static void initDriver() {
		if (testBase==null){
			testBase=new TestBase();
			
		}
			}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	public static void openurl(String url) {
		driver.get(url);
	
	}
	public static void teardown() {
	if (driver!=null) {
		driver.close();
		driver.quit();
		
	}
		testBase=null;
		
	
	}

}




pages
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	
	@FindBy(id="username")
	WebElement userId;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement lgnBtn;
	
	public loginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void loginIntoApp(String strUser, String strPwd) {
		
	userId.sendKeys(strUser);
	pwd.sendKeys(strPwd);
	lgnBtn.click();
}
}



package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement itemOne;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement itemTwo;

	@FindBy(id="shopping_cart_contianer")
	WebElement cartIcon;
	
	@FindBy(xpath="//span[contains(text(), 'Products')]")
	WebElement productsTitle;
	
	//Action
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() {
		itemOne.click();
		itemTwo.click();
		
	}
	public void viewCart() {
		cartIcon.click();
	}
	
	public boolean isonProducts() {
		return productsTitle.isDisplayed();
		
	}

}


package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import base.TestBase;
import junit.framework.Test;
import pages.loginPage;

/**
 * @author Administrator
 *
 */
public class PlaceOrderTest {

	WebDriver driver;
	loginPage loginpage;
	listpage ProductListPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver=TestBase.getDriver();
		loginpage= new loginPage(driver);
		listpage=new ProductListPage(driver);
	}
	@BeforeTest
	public void setup() {
		TestBase.openurl("https://www.saucedemo.com/");
		loginpage.loginIntoApp("standard_user", "secret_sauce");
		
		
	}
	
	public void validLogin(){
		Assert.assertTrue(listpage.isonProducts());
	}
	
	public void addItem()
	
	
}

pom <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>POMDemo</groupId>
  <artifactId>POMDemo</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependencies>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.15.0</version>
</dependency>
  <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.14.0</version>
</dependency>
  <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
</dependency>
   </dependencies>
</project>

