package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocator
{
    public static WebDriver ibrahim;
    public static void main(String args[]) throws InterruptedException {
        String expectedValue="Ne Aramıştınız?";
        invokeChromeBrowser();
        ibrahim.get("http://www.flypgs.com");
        Thread.sleep(2000);
        ibrahim.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/div[1]/ul/li[5]/a")).click();
        Thread.sleep(5000);
        System.out.println("Validation :"+isTextTrue(expectedValue));

    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue)
    {
        String resultValue=ibrahim.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
