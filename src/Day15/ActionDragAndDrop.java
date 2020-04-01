package Day15;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop
{
    public static void main(String[] args)
    {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("li#credit2>a"))));
        WebElement source=driver.findElement(By.cssSelector("li#credit2>a"));
        WebElement target=driver.findElement(By.cssSelector("ol#bank>li"));
        Actions myAction=new Actions(driver);
        myAction.dragAndDrop(source,target).build().perform();

    }
}
