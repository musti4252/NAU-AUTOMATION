package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait
{
    public static void main (String args []) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[type='button']")).click();
        String ExpectedValue="Are you sure you want to give us the deed to your house?";
        if(ExpectedValue.contains(driver.switchTo().alert().getText()))
        {
            driver.switchTo().alert().accept();
        }
    }
}
