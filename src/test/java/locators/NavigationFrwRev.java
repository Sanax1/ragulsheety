package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationFrwRev {

public static void main(String[] args) {

// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();


//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

driver.navigate().to("https://rahulshettyacademy.com");

driver.navigate().back();

driver.navigate().forward();

}


}
