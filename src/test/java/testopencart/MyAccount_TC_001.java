package testopencart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAccount_TC_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		//search any text
		driver.findElement(By.name("search")).sendKeys("Mac");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(20, null);
        //click Myaccount navigate to Register
		WebElement dropDown=driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]"));
		dropDown.click();
		Thread.sleep(3000);
        driver.findElement(By.linkText("Register")).click();
        

		//driver.close();
	}

}
