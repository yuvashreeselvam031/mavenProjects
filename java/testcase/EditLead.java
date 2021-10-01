package testcase;


import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class EditLead extends BaseLead{

	@Test
	public void editLead() throws InterruptedException {
		//click on find lead
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone no
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter the phone no 99
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		//click on find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//click on first display id
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//click on edit button
		driver.findElement(By.linkText("Edit")).click();
		//change company name as tcs	
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		//click on update method
		driver.findElement(By.name("submitButton")).click();
		
}
}






