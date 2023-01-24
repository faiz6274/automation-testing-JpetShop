package helper;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
//POM
public class Browser {
    static WebDriver driver;
    public static WebDriver StartBrowser(String Browser, String url) {
        if (Browser.equalsIgnoreCase("eb")) {
              System.setProperty("webdriver.edge.driver","C:\\Users\\d.hariram\\Downloads\\edgedriver_win64\\msedgedriver.exe");
              driver = new EdgeDriver();
                driver.manage().window().maximize();
              
        }

        else if (Browser.equalsIgnoreCase("cb")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\d.hariram\\Downloads\\chromedriver_win32\\chromedriver.exe");
              driver = new ChromeDriver();
                driver.manage().window().maximize();

 

        }
        driver.get(url);
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         return driver;
    }

 

}