package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker
{
    public static void main(String[] args) throws InterruptedException
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[id='package-departing-hp-package']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.datepicker-cal-date[data-year='2020'][data-month='2'][data-day='31']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input.text.datepicker-trigger-input.gcw-end-date.gcw-storeable.gcw-valid-date.gcw-required[id='package-returning-hp-package']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-year='2020'][data-month='3'][data-day='25']")).click();

    }
}
