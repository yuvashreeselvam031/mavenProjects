package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class DuplicateLead extends BaseLead{
	

	@Test
	public void duplicateLead() throws InterruptedException {
		//click on find lead button
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter phone no. 99
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		//click on find leads button below
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		//get first display id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		// click on duplicate lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//click on reassign button
		driver.findElement(By.name("submitButton")).click();
		
}
}






