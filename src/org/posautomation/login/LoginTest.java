package org.posautomation.login;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @BeforeMethod
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @AfterMethod
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void login() {
	    driver.get("https://scuwkj98nz556938096-cpos.su.retail.dynamics.com/#DeviceId=5000T06&TerminalId=5000T06");
	    driver.manage().window().setSize(new Dimension(1296, 688));
	    driver.findElement(By.id("nextButton")).click();
	    js.executeScript("window.scrollTo(0,0)");
	    driver.findElement(By.id("activateButton")).click();
	    js.executeScript("window.scrollTo(0,0)");
	    driver.findElement(By.id("i0116")).sendKeys("mg43009@malabargroup.com");
	    driver.findElement(By.id("i0118")).sendKeys("Kasthuri@2024");
	    driver.findElement(By.id("idSIButton9")).click();
	    driver.findElement(By.id("idSIButton9")).click();
	    driver.findElement(By.id("idSIButton9")).click();
	    driver.findElement(By.id("retryActivationButton")).click();
	    driver.findElement(By.cssSelector(".table-cell > div:nth-child(1)")).click();
	    driver.findElement(By.id("splashScreen")).click();
	  }
	}

