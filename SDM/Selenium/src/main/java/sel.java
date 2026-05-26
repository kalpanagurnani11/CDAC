import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sel {
	public static void main(String args[])
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ppp");
		
//		user name by using x path
//		password by name
//		login button by id
//		it should navigate to home page
//		
		
	}

}
