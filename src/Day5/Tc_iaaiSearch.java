package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_iaaiSearch
{

    static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        chrome();
        driver.get("http://www.iaai.com");
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys("lexus");
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).getAttribute("placeholder");
        System.out.println(driver.findElement(By.id("txtSearch")).getAttribute("placeholder"));
        Thread.sleep(1000);
        driver.navigate().to("http://www.amazon.com");
        System.out.println("this :"+driver.findElement(By.xpath("//*[@id='nav-orders']/span[2]")).getText());
    }
    public static void chrome()
    {
        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
}
