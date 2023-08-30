import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandlingDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
	
		driver.navigate().to("https://www.letskodeit.com/practice");
		WebElement RBbmw =  driver.findElement(By.id("bmwradio"));
		RBbmw.click();
		
		System.out.println("Value of BMW : " + RBbmw.getAttribute("value"));
		System.out.println("Name of BMW : " + RBbmw.getAttribute("Name"));
		System.out.println("Name of Type : " + RBbmw.getAttribute("type"));
		
		
		
		WebElement RBbenz = driver.findElement(By.id("benzradio"));
		RBbenz.click();
		
		System.out.println("Value of BENZ : " + RBbmw.getAttribute("value"));
		System.out.println("Name of BENZ : " + RBbmw.getAttribute("Name"));
		System.out.println("Type of Type : " + RBbmw.getAttribute("type"));
		
		
		driver.close();
		
		
		
		
	}

}
