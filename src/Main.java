
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C://Users//Mayank.AzureAD//Desktop//Self learning Contents//Selenium Jars and Drivers//Drivers//Chrome//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
          driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Flipkart");
          driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
          driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Flipkart']")).click();
          driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]")).click();

    }
}