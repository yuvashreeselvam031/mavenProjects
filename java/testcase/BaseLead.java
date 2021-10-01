package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLead {
	public ChromeDriver driver;
	@Parameters({"username","password"})
  @BeforeMethod
  public void preCondition( String username, String password) {
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//clicking login
		driver.findElement(By.className("decorativeSubmit")).click();
		//clicking crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//clicking leads
		driver.findElement(By.linkText("Leads")).click();
  }
  
  @AfterMethod
  public void postCondition() {
	  driver.close();

}
}
