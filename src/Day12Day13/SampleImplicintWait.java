package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SampleImplicintWait
{
    public static void main(String[] args)
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("input[type='button']")).click();
        String expectedValue="Are you sure you want to give us the deed to your house?')";
        if(expectedValue.contains(driver.switchTo().alert().getText()))
        {
            driver.switchTo().alert().accept();
        }
    }
}
