package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("8-72107783");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=12665\']")).click();
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen246")).sendKeys("12665");
		driver.findElement(By.id("ext-gen334")).click();

	}

}
