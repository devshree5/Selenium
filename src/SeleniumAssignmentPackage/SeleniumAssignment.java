package SeleniumAssignmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuim\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Amazon...");
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		driver.close();

	}

}
