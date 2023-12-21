package Selenium_HomeTask;

import org.junit.*;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.*;


public class HomeTaskSelenium1 {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void BinaSiteTest() throws InterruptedException {
       //www.bina.az
      // kullanici www.bina.az linkine gider
      // kullanici www.bina.az linkinde oldugunu dogrular
      driver.get("https://bina.az/");
      String expectedUrlBina="https://bina.az/";
      String actualUrlBina = driver.getCurrentUrl();
      assertEquals(expectedUrlBina,actualUrlBina);

      //kullanici home page de oldugunu dogrular
      String binaTittle = "bina.az - En son ev elanlari sayti, Dasinmaz emlak";
      String actualTittle = driver.getTitle();
      assertEquals(binaTittle,actualTittle);

      //kullanici “Dəstək xidməti: (012) 505-08-02” bilgisinin sayfada gorundugunu dogrular
      WebElement checkDestekXidmeti = driver.findElement(By.xpath("//div[@class='header-bar-i header-bar-i_support-phone']"));
      assertTrue(checkDestekXidmeti.isDisplayed());

        // kullanici ekran boyutunu 515,340 olarak ayarlar.
        // kullanici ekran boyutunu 515,340 oldugunu dogrular
         Thread.sleep(2000);
         Dimension expectedSize= new Dimension (515,340);
         driver.manage().window().setSize(expectedSize);
         Dimension actualSize = driver.manage().window().getSize();
         assertEquals(actualSize,actualSize);

         //kullanici ekran pozisyonunu 500,500 olarak ayarlar
         //kullanici ekran pozisyonunu 500,500 oldugunu dogrular
        Thread.sleep(2000);
        Point expectedPostion = (new Point(500,500));
        driver.manage().window().setPosition(expectedPostion);
        Point actualPOsition = driver.manage().window().getPosition();
        assertEquals(expectedPostion,actualPOsition);

//        kullanici ekrani maximize yapar+
//        kullanici “Alqı-satqı” linkini tiklar
//        kullanici “Alqı-satqı” sayfasında oldugunu dogrular(title ile)
        driver.manage().window().maximize();
        WebElement alqiSatqi = driver.findElement(By.xpath("(//a[@href='/alqi-satqi'])[1]"));
        alqiSatqi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String actualAlqiTitle = driver.getTitle();
        String expextedAlqiTitle = "Ev alqi satqisi elanlari, Evlerin alqi satqisi - bina.az";
        assertEquals(expextedAlqiTitle,actualAlqiTitle);

        // kullanici home page e doner
        // kullanici home page de oldugunu dogrular
        driver.navigate().back();
        assertEquals(expectedUrlBina,actualUrlBina);

        //kullanici “Alış, Mənzil, Otaq sayı, Qiymət, AZN, Bakı, Ətraflı axtarış, Axtar” linklerinin gorunur oldugunu dogrular
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement checkAlish = driver.findElement(By.xpath("(//span[@class='label'])[1]"));
        assertTrue(checkAlish.isDisplayed());
        WebElement checkMenzil = driver.findElement(By.xpath("(//span[@class='label'])[2]"));
        assertTrue(checkMenzil.isDisplayed());
        WebElement checkOtaqSayi = driver.findElement(By.xpath("//div[@class='selectric-wrapper selectric-js-selectric selectric-multiple selectric-js-search-form-rooms selectric-responsive']"));
        assertTrue(checkOtaqSayi.isDisplayed());
        WebElement checkQiymet = driver.findElement(By.xpath("(//div[@class='search-row__input_placeholder js-search-row-input-placeholder'])[2]"));
        assertTrue(checkQiymet.isDisplayed());
        WebElement checkBaki = driver.findElement(By.linkText("Bakı"));
        assertTrue(checkBaki.isDisplayed());
        WebElement checkEtrafli = driver.findElement(By.id("js-search-row-filters-btn"));
        assertTrue(checkEtrafli.isDisplayed());
        WebElement checkAxtar = driver.findElement(By.xpath("(//button[@name='button'])[1]"));
        assertTrue(checkAxtar.isDisplayed());

        //kullanici “Elan yerləşdir” butonunun aktif oldugunu dogrular
        WebElement checkElanYerleshdir = driver.findElement(By.cssSelector("a[class='new header-new-btn']"));
        assertTrue(checkElanYerleshdir.isEnabled());

        // kullanici “Otaq sayı” elementinin aktif oldugunu dogrular
        // kullanici “Otaq sayı” elementini tiklar
        // kullanici “1 otaqlı” elementinin secili olmadigini dogrular
        WebElement checkOtaqsay = driver.findElement(By.xpath("(//span[@class='label'])[3]"));
        assertTrue(checkOtaqsay.isEnabled());
        checkOtaqsay.click();
        WebElement otaq1 = driver.findElement(By.xpath("(//li[@data-index='1'])[3]"));
        assertFalse(otaq1.isSelected());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // kullanici “Mənzil” elementininin gorunur oldugunu dogrular
        // kullanici “Mənzil” elementini tiklar
        WebElement checkMenzil1 = driver.findElement(By.xpath("(//span[@class='label'])[2]"));
        assertTrue(checkMenzil1.isDisplayed());
        checkMenzil1.click();

        // kullanici “Yeni tikili” elementini secer
       // kullanici “Yeni tikili” elementininin gorunur oldugunu dogrular
       WebElement checkYeniTikili = driver.findElement(By.xpath("//span[text()='Yeni tikili']"));
       checkYeniTikili.click();
       WebElement showYenitikili = driver.findElement(By.xpath("(//span[text()='Yeni tikili'])[1]"));
       assertTrue(showYenitikili.isDisplayed());
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
}