package testopencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_TC_002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		//select account and click Register buuton
		WebElement dropDown=driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		dropDown.click();
		Thread.sleep(2000);
		//provide the neccessary fields
        driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("sri");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("abcsri70@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("12345678");
		//check radio button selected
		WebElement radiobutton=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"));
		radiobutton.click();
	    System.out.println(	radiobutton.isSelected());
		//verify checkbox is selected
		WebElement checkbox=driver.findElement(By.cssSelector("input[name='agree']"));
		checkbox.click();
		checkbox.isSelected();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		driver.close();

		








		
		
		//driver.close();
	}

}
