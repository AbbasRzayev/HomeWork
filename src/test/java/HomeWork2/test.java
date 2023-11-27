package HomeWork2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void name() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.e-reqabet.az/v2");
        WebElement daxilOL = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium unauthorized-header_mdNone__35AQH unauthorized-header_logButton__yl49h css-lbxvn0']"));
        daxilOL.click();
        WebElement asanLogin = driver.findElement(By.xpath("//img[@src='/v2/asan-login.svg']"));
        asanLogin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement identifi = driver.findElement(By.xpath("(//div[@class='panel-left'])[1]"));
        identifi.click();
        WebElement nomreDaxil = driver.findElement(By.xpath("//input[@maxlength='8']"));
        nomreDaxil.sendKeys("6JPKNDA");
        WebElement adDaxil = driver.findElement(By.xpath("//input[@placeholder='Şifrənizi daxil edin']"));
        adDaxil.sendKeys("Tural356");
        WebElement ireli = driver.findElement(By.xpath("//div[@class='base-button']"));
        ireli.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement mensheEnter = driver.findElement(By.xpath("//div[@class='hero_circle__53qyR hero_n_4__7RgrM']"));
        mensheEnter.click();
        WebElement testiq = driver.findElement(By.xpath("//a[@style='text-decoration: none; color: rgb(196, 196, 196); cursor: default;']"));
        testiq.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));














    }
}
