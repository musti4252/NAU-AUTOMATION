package Day12Day13;

import Day8.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonTCandCalculateGroup
{
    public static void main(String[] args) throws InterruptedException {
        ChromeBrowser myBrowser=new ChromeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Milk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Butter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Cheese']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Water']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Beer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='Wine']")).click();
        Thread.sleep(2000);
        int count=driver.findElements(By.name("group1")).size();
        System.out.println("The number of radio button in group is :"+count);
        for(int i=0; i<count; i++)
        {
            driver.findElements(By.name("group1")).get(i).click();
        }

    }
}
