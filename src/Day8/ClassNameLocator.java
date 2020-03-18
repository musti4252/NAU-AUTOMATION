package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator
{
    static WebDriver ibrahim;
    public static void main(String ibram[]) throws InterruptedException {
        invokeChromeBrowser();
        ibrahim.get("http://www.turkishairlines.com");
        Thread.sleep(2000);
        ibrahim.findElement(By.className("thyHeaderLink")).click();
        Thread.sleep(2000);
        ibrahim.quit();
    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
}
