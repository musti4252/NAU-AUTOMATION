package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvocationCallMethodForDay3
{

    public void chrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driverchrome=new ChromeDriver();
        driverchrome.get("http://www.amazon.com");
    }
    public void firefox()
    {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Musti\\Documents\\geckodriver-v0.26.0-win64-1\\geckodriver.exe");
        WebDriver driverfirefox=new FirefoxDriver();
        driverfirefox.get("http://www.ebay.com");

    }
}
