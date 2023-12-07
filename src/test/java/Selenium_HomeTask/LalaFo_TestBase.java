package Selenium_HomeTask;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LalaFo_TestBase {
    static WebDriver driver;
    @Before
    public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://lalafo.az/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void name() {



    }
}
