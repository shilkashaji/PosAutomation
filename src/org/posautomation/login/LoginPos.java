package org.posautomation.login;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MG43009\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://scuwkj98nz556938096-cpos.su.retail.dynamics.com/#DeviceId=5108T05&TerminalId=5108T05");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("nextButton")).click();
		driver.findElement(By.id("activateButton")).click();
		driver.findElement(By.name("loginfmt")).sendKeys("mg43009@malabargroup.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Shaji@2024");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		driver.findElement(By.id("KmsiCheckboxField")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(5000);
		Dimension dimension = new Dimension(1024,900);
		driver.manage().window().setSize(dimension);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(15000);
		driver.findElement(By.id("retryActivationButton")).click();
		Thread.sleep(20000);
	    WebElement a= driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div[2]"));
	    a.click();
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.id("signInButton")).click();
	    driver.findElement(By.name("loginfmt")).sendKeys("mg43009@malabargroup.com");
	    driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Shaji@2024");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[1]/div/div/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/button[4]/div[2]/div")).click();
	
	}

}
