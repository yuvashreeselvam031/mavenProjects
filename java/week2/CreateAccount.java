package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Imaya");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("vardhini");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("18000");
		
		WebElement dd1 = driver.findElement(By.name("industryEnumId"));
	    Select drpdwn1 = new Select(dd1);
	    drpdwn1.selectByValue("IND_SOFTWARE");
	    WebElement dd2 = driver.findElement(By.name("ownershipEnumId"));
	    Select drpdwn2 = new Select(dd2);
	    drpdwn2.selectByVisibleText("S-Corporation");
	    WebElement dd3 = driver.findElement(By.id("dataSourceId"));
	    Select drpdwn3 = new Select(dd3);
	    drpdwn3.selectByValue("LEAD_EMPLOYEE");
	    WebElement dd4 = driver.findElement(By.id("marketingCampaignId"));
	    Select drpdwn4 = new Select(dd4);
	    drpdwn4.selectByIndex(6);
	    WebElement dd5 = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select drpdwn5 = new Select(dd5);
	    drpdwn5.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	    
		
	}

}
