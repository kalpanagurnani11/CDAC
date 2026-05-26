import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class findElement {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
//		WebElement e=driver.findElement(By.name("q"));
//		e.sendKeys("Kalpana");
//		e.submit();
////		WebElement b=driver.findElement(By.name("btnK"));
////		b.click();
////		driver.findElement(By.name("q")).getScreenshotAs(null)
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ppp");
		
		
		

		
//		((WebElement) driver).click();

	}

}
