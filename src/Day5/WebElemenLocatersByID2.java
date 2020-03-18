package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElemenLocatersByID2
{

    public static WebDriver driver;
    public static void main (String args[]) throws InterruptedException {
        firefoxInvocations();
        driver.get("http://www.expedia.com");
        driver.findElement(By.id("package-origin-hp-package")).sendKeys("H");
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys("i");
        Thread.sleep(2000);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(200);
        driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(200);
        driver.findElement(By.id("package-departing-hp-package")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("package-departing-hp-package")).sendKeys("03/04/2020");
        Thread.sleep(2000);
        driver.findElement(By.id("package-returning-hp-package")).click();
        Thread.sleep(2000);
        for(int i=1; i<11;i++)
        {
            driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        }

        driver.findElement(By.id("package-returning-hp-package")).sendKeys("03/05/2020");
        Thread.sleep(2000);
        driver.findElement(By.id("search-button-hp-package")).click();
    }
    public static void firefoxInvocations()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64-1\\geckodriver.exe");
        driver=new FirefoxDriver();
    }
}
