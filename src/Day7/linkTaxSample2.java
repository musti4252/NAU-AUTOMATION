package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTaxSample2
{
    public static WebDriver mustafa;
    public static void main(String args[]) throws InterruptedException {
        String expectedValue="We are applying a Zero Change Fee for international flights, so that you can plan your travel with more flexibility, comfort and peace of mind.";
        invokeChromeBrowser();
        mustafa.get("https://www.turkishairlines.com/en-int/");
        Thread.sleep(2000);
        mustafa.findElement(By.xpath("//*[@id='tcm508-284603']/div/div/div/div/div/div[1]")).getText();
        System.out.println("Result Validation :"+isTextTrue(expectedValue));



    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        mustafa=new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue)
    {
        String expectedValidation=mustafa.findElement(By.xpath("//*[@id='tcm508-284603']/div/div/div/div/div/div[1]")).getText();
        return expectedValidation.equals(expectedValue);
    }
}
