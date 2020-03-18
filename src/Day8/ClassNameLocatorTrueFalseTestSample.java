package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorTrueFalseTestSample
{
    static WebDriver ibrahim;
    public static void main(String ibram[]) throws InterruptedException {
        String buttonClick=" FLY DIFFERENT ";
        invokeChromeBrowser();
        ibrahim.get("http://www.turkishairlines.com");
        Thread.sleep(2000);
        ibrahim.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/ul[2]/li[2]/a")).click();
        Thread.sleep(2000);
        System.out.println("Button is :"+isLocatortrue(buttonClick));
        Thread.sleep(2000);
        ibrahim.quit();
    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
    public static boolean isLocatortrue(String buttonClick)
    {

        String button=ibrahim.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/ul[2]/li[2]/a")).getText();
        return button.equals(buttonClick);
    }
}
