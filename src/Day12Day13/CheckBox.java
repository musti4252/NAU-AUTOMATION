package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox
{
    public static void main(String[] args) throws InterruptedException
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).click();
        Thread.sleep(2000);
        System.out.println("Is Selected true or false :"+driver.findElement(By.cssSelector("input#partialHotelBooking-hp-package")).isSelected());
    }
}
