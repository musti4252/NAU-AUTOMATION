package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculateAllRadioButton
{
    public static void main(String args[]) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        Thread.sleep(2000);
        int count=driver.findElements(By.cssSelector("input[type='radio']")).size();
        Thread.sleep(2000);
        System.out.println("The Number of All Radio Buttons :"+count);
        Thread.sleep(2000);
        for (int i=0; i<count; i++)
        {
            driver.findElements(By.cssSelector("input[type='radio']")).get(i).click();
            Thread.sleep(2000);
        }
    }
}
