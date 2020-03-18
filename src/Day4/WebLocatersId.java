package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocatersId
{

    static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        firefox();
        driver.get("http://www.skyscanner.com");
        Thread.sleep(5000);
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("istanbul");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("gaziantep");

    }
    public static void firefox()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64-1\\geckodriver.exe");
        driver=new FirefoxDriver();

    }
}
