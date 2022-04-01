package testopencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_TC_005 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(1000);
		WebElement dropDown=driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		dropDown.click();	
		Thread.sleep(1000);
        driver.findElement(By.linkText("Login")).click();
        //login with credentials
		driver.findElement(By.id("input-email")).sendKeys("abcsri70@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("abc@sri123");
	    //driver.findElement(By.linkText("Forgotten Password")).click();
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1000);
		WebElement account=driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		account.click();	
		Thread.sleep(1000);
        driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
        driver.findElement(By.linkText("Continue")).click();
    	//driver.close();
       	}

}
