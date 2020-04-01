package Day14;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionsClassSendKeys1
{
    public static void main(String[] args)
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");
        WebDriverWait wait=new WebDriverWait(driver,20);
        Actions myMouse=new Actions(driver);
        myMouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().perform();
        myMouse.sendKeys("shoes").perform();
        myMouse.moveToElement(driver.findElement(By.cssSelector("input[type='submit']"))).click().perform();
    }
}
