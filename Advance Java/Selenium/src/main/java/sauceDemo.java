import java.io.File;
import java.io.IOException;

import org.apache.tomcat.jakartaee.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sauceDemo {
	public static void main(String args[]) throws InterruptedException

	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();	
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Kalpana");
		driver.findElement(By.id("last-name")).sendKeys("Gurnani");
		driver.findElement(By.id("postal-code")).sendKeys("400074");
		Thread.sleep(2000);
		driver.findElement(By.name("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("finish")).click();
		Thread.sleep(5000);
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile,new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("back-to-products")).click();
		
		
		
		
		}
}
