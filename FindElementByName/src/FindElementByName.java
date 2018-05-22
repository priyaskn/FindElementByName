
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByName {

	public static void main(String args[])
	
	{   
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.indeed.co.in");
		driver.findElement(By.name("q")).sendKeys("QTP");
		driver.findElement(By.name("l")).sendKeys("Calcutta");
		driver.findElement(By.id("fj")).click();
		driver.findElement(By.partialLinkText("Upload")).click();
		
	}
}
