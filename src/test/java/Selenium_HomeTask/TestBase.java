package Selenium_HomeTask;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBase {
    protected static WebDriver driver;
    protected static ExtentReports extentReports; //Raporlamayı başlatır
    protected static ExtentHtmlReporter extentHtmlReporter;//Raporu HTML formatında düzenler
    protected static ExtentTest extentTest;
    @Before
    public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/reports/extentReport_"+tarih+".html";
        extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        //Raporda gözükmesini istediğimiz bilgiler için
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Hakan");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("Smoke Test Raporu");
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        extentReports.flush();
    }


    @Test
    public void name() {




    }
    public static void AssertUrlCheck(String url1, String url2)
    {
        assertEquals(url1,url2);
    }

    public static void AssertIsDisplayed(WebElement elem)
    {
        assertTrue(elem.isDisplayed());
    }

}

