package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	@Test
	public void loginGmail() {


		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("//span[@class='laptop-desktop-only']")).click();
		driver.findElement(By.id("firstName")).sendKeys("arohi");
		driver.findElement(By.id("lastName")).sendKeys("A");
		driver.findElement(By.id("username")).sendKeys("a85841177");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password*9");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("password*9");
		driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']")).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("8925307658");
		
	}
	
	
}
