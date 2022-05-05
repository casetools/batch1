import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer8\\Desktop\\20002\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("W3schools",Keys.ENTER);
	driver.findElement(By.id("search2")).sendKeys("JavaScript",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[2]/td/div/h3/a")).click();
	driver.findElement(By.name("q")).sendKeys("javascript",Keys.ENTER);
	driver.findElement(By.id("search2")).sendKeys("JavaScript",Keys.ENTER);
}
}
