package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForwardBackCallMethod
{
    public WebDriver chrome()
    {
        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;

    }
    public void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http//www.amazon.com");
    }
}
