package MEIS;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Meis_Test_Base {
  public  WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.close();
    }
    public static void clickButton(WebElement buttonName)
    {
        buttonName.click();
    }

    public  static void checkText(WebElement actual, String expected)
    {
        assertTrue(actual.getText().equals(expected));
    }
    public static void checkTextContain(WebElement actual, String expected)
    {
        assertTrue(actual.getText().contains(expected));
    }

    public static void sendKey(WebElement elem)
    {
      elem.sendKeys("");
    }
    public static void clearInputText(WebElement elem)
    {
        int textLength = elem.getAttribute("value").length();
        for (int i = 0; i < textLength; i++) {
            elem.sendKeys(Keys.BACK_SPACE);
        }
    }

    public void sistemeDaxilOL()
    {
        driver.get("http://test.meis.competition.gov.az/auth");
        WebElement sistemeGirish = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-auth/div/div/div[2]/div"));
        clickButton(sistemeGirish);
        WebElement istifadeGirish = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
        clickButton(istifadeGirish);
        WebElement login = driver.findElement(By.id("mat-input-0"));
        login.sendKeys("imranovfarid@gmail.com");
        WebElement paswword = driver.findElement(By.id("mat-input-1"));
        paswword.sendKeys("Farid1020");
        WebElement daxilOl = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
        clickButton(daxilOl);
    }

    public void implictWait()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }


//    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//        if (frames.size() > 0) {
//        // The frame exists, you can proceed to switch to it
//    }

    public static void robotClassDosyaYukleme(String filePath) {
        try {
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            Robot robot = new Robot();

            // Press CTRL+V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            // Press ENTER to confirm the file upload
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}