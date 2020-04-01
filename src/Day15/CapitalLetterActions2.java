package Day15;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions2
{
    public static void main(String[] args)
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions=new Actions(driver);
        WebElement myElement=driver.findElement(By.cssSelector("input#email"));
        Action action=myActions.moveToElement(myElement)
                .click()
                .keyDown(myElement,Keys.SHIFT)
                .sendKeys("mustafa")
                .keyUp(myElement,Keys.SHIFT)
                .build();
        action.perform();
    }
}
