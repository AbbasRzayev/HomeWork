package RealProjectPractice;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Menshe {
   static WebDriver driver;
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.e-reqabet.az/v2");
        WebElement daxilOL = driver.findElement(By.xpath("//div[@class='hero_circle__53qyR hero_n_4_16__JoKnb']"));
        daxilOL.click();
        WebElement menshe = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div/section[1]/main/div/div[1]/div/div/div[4]"));
        menshe.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement asanLogin = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div/button[2]/img"));
        asanLogin.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        List<WebElement> elements = driver.findElements(By.className("ng-tns-c4-0"));
        // Check if the index is within the bounds of the list
        int indexToSelect = 2; // Change this to the desired index
        if (indexToSelect >= 0 && indexToSelect < elements.size()) {
            WebElement desiredElement = elements.get(indexToSelect);
            desiredElement.click(); // Or perform any other action you need
        } else {
            System.out.println("Index out of bounds: " + indexToSelect);
        }
        WebElement nomreDaxil = driver.findElement(By.xpath("(//input[@class='ng-tns-c5-1 ng-untouched ng-pristine ng-invalid'])[1]"));
        nomreDaxil.sendKeys("6JPKNDA");
        WebElement adDaxil = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div/input"));
        adDaxil.sendKeys("Tural356");
        WebElement ireli = driver.findElement(By.xpath("//div[@class='submit-button']"));
        Thread.sleep(2000);
        ireli.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement mensheEnter = driver.findElement(By.xpath("(//div[@class='cursor-pointer e-service-card_card__e_kP0'])[4]"));
        mensheEnter.click();
        WebElement tanisliq = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-ygcd3b'])[2]"));
        tanisliq.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        WebElement testiq1 = driver.findElement(By.xpath("//*[@id=\"confirm-information\"]"));
        testiq1.click();

        WebElement popUp = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='Toastify__close-button Toastify__close-button--light']")));
        popUp.click();

        WebElement yeniMuraciet = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-1080bgm'])[2]")));
        yeniMuraciet.click();

        WebElement unvanlanacaqQurum = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-fvipm8'])[1]")));
        unvanlanacaqQurum.click();

        WebElement unvanlanmishBaki = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("((//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']))[3]")));
        unvanlanmishBaki.click();

        WebElement mensheSertifikatininNovu = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiBox-root css-1rr4qq7'])[2]")));
        mensheSertifikatininNovu.click();

        WebElement aformaliSertifikat = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[3]")));
        aformaliSertifikat.click();

        WebElement xariciDilEkspertiza = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/label/span[2]"));
        xariciDilEkspertiza.click();

        WebElement dilEkspertizaSay = driver.findElement(By.id(":rj:"));
        dilEkspertizaSay.sendKeys("1");

        WebElement muracietinTipi = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div")));
        muracietinTipi.click();

        WebElement mensheSertifikatininVerilmesi = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")));
        mensheSertifikatininVerilmesi.click();

        WebElement muqavileMelumat = driver.findElement(By.xpath("(//div[@class='MuiAccordionSummary-content MuiAccordionSummary-contentGutters css-17o5nyn'])[2]"));
        muqavileMelumat.click();

       WebElement muqavileninNomresi = driver.findElement(By.xpath("//input[@name='contractNumber']"));
       muqavileninNomresi.sendKeys("TestMuqavile");

       WebElement qeyd = driver.findElement(By.xpath("//*[@id=\":rl:\"]"));
       qeyd.sendKeys("Test_Qeyd");

       WebElement muqTarix = driver.findElement(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[1]/div[1]/div[1]/div[3]/div/div/button/svg/path"));
       muqTarix.click();

       //WebElement tarixSec = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root Mui-selected MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz']"));


    }
    }