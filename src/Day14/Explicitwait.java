package Day14;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait
{
    public static void main(String args[])
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
// Set the time out for Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver,20);
                          //click flight button
// write the code which is relevant to web element with ' visibilityOf '
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
                          //click hotels button
// write the code which is relevant to web element with ' presenceOfElementLocated(By.) '
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tab-hotel-tab-hp")));
        driver.findElement(By.id("tab-hotel-tab-hp")).click();
                         //click Bundle and save
// write the code which is relevant to web element with 'elementToBeClickable()'
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='tab-package-tab-hp']")));
        driver.findElement(By.id("tab-package-tab-hp")).click();

// write the code which is relevant to web element with 'invisibilityof'
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));
        System.out.println("All codes invisible");

    }
}
