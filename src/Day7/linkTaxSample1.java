package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTaxSample1
{
    public static WebDriver mustafa;
    public static void main(String args[]) throws InterruptedException
    {
        String expectedValue = "Bilet İşlemleri";
        invokeChromeBrowser();
        mustafa.get("http://www.flypgs.com");
        Thread.sleep(3000);
        mustafa.findElement(By.linkText("BİLET İŞLEMLERİM")).click();
        Thread.sleep(3000);
        System.out.println("Validation :" + isTextTrue(expectedValue));
        Thread.sleep(3000);
       // mustafa.quit();
    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        mustafa = new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue)
    {
        String resultValidation=mustafa.findElement(By.xpath("//*[@id='sb-site']/section[3]/div/h2")).getText();
        return resultValidation.equals(expectedValue);
    }
}
