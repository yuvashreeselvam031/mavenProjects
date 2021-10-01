package testcase;



import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class DeleteLead extends BaseLead{

	@Test
	public void deleteLead() throws InterruptedException {
		//click on find lead button
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone 
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		// click on find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//getting first display value, storing in leadID
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		//clicking on first display
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		// click on delete
		driver.findElement(By.linkText("Delete")).click();
		// again click on find lead
		driver.findElement(By.linkText("Find Leads")).click();
		//sending the leadID on first
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		//click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//getting display records
		String text = driver.findElement(By.className("x-paging-info")).getText();
		//verify 
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		
}
}






