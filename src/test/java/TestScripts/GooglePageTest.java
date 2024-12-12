package TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest {
  WebDriver driver;
@Test
  public void seleniumSearchTest() {
	driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	driver.navigate().to("https://www.google.com/");
	//WebElement searchBox= driver.findElement(By.id("APjFqb"));
	WebElement searchBox= driver.findElement(By.className("gLFyf"));
	searchBox.sendKeys("Selenium New Version") ;
	searchBox.sendKeys(Keys.ENTER);
	System.out.println("Page Title..."+ driver.getTitle());
	driver.navigate().back();
	System.out.println("Page Title..."+ driver.getCurrentUrl());
	//Assert.assertEquals(driver.getTitle(),"Selenium Basics - Google Search");
	//Assert.assertEquals(driver.getTitle(),"Selenium Basis - Google Search");
}
  }
