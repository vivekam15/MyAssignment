package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen248")).sendKeys("Viveka");
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=12665']")).click();
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=12665']")).click();
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.id("ext-gen602")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
