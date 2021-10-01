package myFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.className("inputBox")).sendKeys("Testleaf");
		 driver.findElement(By.className("inputBox")).sendKeys("Yuva");
		 driver.findElement(By.className("inputBox")).sendKeys("Shree");
		 driver.findElement(By.className("smallSubmit")).click();
	}

}
