package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutPutXpathSolution
{

    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        chrome();
        driver.get("http://www.ebay.com");
        Thread.sleep(500);
        driver.findElement(By.id("gh-ac")).sendKeys("java");
        Thread.sleep(500);
        driver.findElement(By.id("gh-btn")).click();
        System.out.println("Search Result For Ebay :"+driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/div[2]/div[2]/div/div[1]/h1")).getText());

    }
    public static void chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
    }

}
