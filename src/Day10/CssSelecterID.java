package Day10;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelecterID
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(2000);
        for(int i=0; i<4; i++)
        {
        driver.findElement(By.cssSelector("input#package-origin-hp-package[type='text'")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.cssSelector("#package-origin-hp-package[spellcheck='false']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-destination-hp-package[autocomplete='off']")).sendKeys("Las Vegas");
        Thread.sleep(2000);
        for(int i=0; i<1; i++)
        {
        driver.findElement(By.cssSelector("#package-destination-hp-package[aria-autocomplete='list']")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='package-destination-hp-package']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#package-departing-hp-package[data-min-range-length='1']")).sendKeys("03/25/2020");
        Thread.sleep(200);
        for(int i=0; i<11; i++)
        {
            driver.findElement(By.cssSelector("input#package-returning-hp-package")).sendKeys(Keys.BACK_SPACE);
        }
        Thread.sleep(200);
        driver.findElement(By.cssSelector("input#package-returning-hp-package")).sendKeys("03/30/2020");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[alt='Travelers']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/div/div/div[1]/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("label[for='partialHotelBooking-hp-package']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#search-button-hp-package[type='submit']")).click();
    }
}
