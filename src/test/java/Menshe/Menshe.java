package Menshe;

import io.cucumber.java.en_old.Ac;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Menshe extends MensheBase {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get("https://test.e-keyfiyyet.gov.az/v2/e-services");
        String girish1 = "Giriş";
        WebElement girish = driver.findElement(By.xpath("//*[contains(text(), '" + girish1 + "')]"));
        girish.click();

        Thread.sleep(1000);

        String asan = "asan-login";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement asanLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div/div/button[2]")));
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

        String girishMenshe = "Mənşə sertifikatı";
        WebElement girishMenshe1 = driver.findElement(By.xpath("//*[contains(text(), '" + girishMenshe + "')]"));
        girishMenshe1.click();
        WebElement tanisliq = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-ygcd3b'])[2]"));
        tanisliq.click();


//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        WebElement mensheEnter = driver.findElement(By.xpath("(//div[@class='cursor-pointer e-service-card_card__e_kP0'])[4]"));
//        mensheEnter.click();
//        WebElement tanisliq = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-ygcd3b'])[2]"));
//        tanisliq.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        WebElement testiq1 = driver.findElement(By.xpath("//*[@id=\"confirm-information\"]"));
        testiq1.click();

        WebElement popUp = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='Toastify__close-button Toastify__close-button--light']")));
        popUp.click();

        // WebElement yeniMuraciet = new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-1080bgm'])[2]")));
        WebElement yeniMuraciet = new WebDriverWait(driver, Duration.ofSeconds(100)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div[2]/div[4]/div[2]/a[3]/button")));
        Thread.sleep(2000);
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

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement tarixAdd = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1'])[1]")));
        tarixAdd.sendKeys("30.11.2023");

        WebElement catirilacaqOlke = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-b52kj1'])[3]")));
        catirilacaqOlke.click();
        String catOlke1 = "Antarctica";
        WebElement catOlke = driver.findElement(By.xpath("//*[contains(text(), '" + catOlke1 + "')]"));
        catOlke.click();

        WebElement aliciAdd = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(":rn:")));
        aliciAdd.sendKeys("TestAlici");

        WebElement customerAdd = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r13:")));
        customerAdd.sendKeys("TestCustomer");

        WebElement yukAdd = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(":ro:")));
        yukAdd.sendKeys("TestYuk");

        WebElement receiverAdd = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r14:")));
        receiverAdd.sendKeys("TestReceiver");

        WebElement idxalOlke = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":rp:")));
        idxalOlke.click();

        String idolke = "Albaniya";
        WebElement idxkec = driver.findElement(By.xpath("//*[contains(text(), '" + idolke + "')]"));
        idxkec.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        WebElement mw = driver.findElement(By.id(":r10:"));
        actions.scrollToElement(mw).perform();
        Thread.sleep(1000);
        WebElement idxalciUnvan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":rr:\"]")));
        idxalciUnvan.sendKeys("Test idxal unvan");

        WebElement adrees = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r17:")));
        adrees.sendKeys("Test adress");

        WebElement satici = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":rs:")));
        satici.sendKeys("Test satici");

        WebElement seller = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r18:")));
        seller.sendKeys("Test seller");

        WebElement yukGonderen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":rt:")));
        yukGonderen.sendKeys("Test yukgonderen");

        WebElement sender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r19:")));

        sender.sendKeys("Test sender");

        WebElement ixraClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf'])[2]")));
        ixraClick.click();
        String ixraClick1 = "Albaniya";
        WebElement ixraCli2 = driver.findElement(By.xpath("//*[contains(text(), '" + ixraClick1 + "')]"));
        ixraCli2.click();

        WebElement ixraUnvan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r10:")));
        ixraUnvan.sendKeys("Test unvan");

        WebElement ixraAdress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":r1c:\"]")));
        ixraAdress.sendKeys("TestAdress");

        WebElement faylFirst = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div/div[1]/label")));
        Thread.sleep(1000);


        faylFirst.click();
        String filePath = "C:\\Users\\User\\Desktop\\TestFiles\\Test.png";
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);
        Thread.sleep(1000);
        WebElement fayl7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[7]/div[3]/div/div[1]/label")));
        actions.scrollToElement(fayl7).perform();

        WebElement fayl2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[1]/label")));
        fayl2.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);


        WebElement fayl3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[3]/div[3]/div/div[1]/label")));
        fayl3.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        WebElement fayl4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[4]/div[3]/div/div[1]/label")));
        fayl4.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        WebElement fayl5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[5]/div[3]/div/div[1]/label")));
        fayl5.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        WebElement fayl6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"panel1bh-content\"]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[6]/div[3]/div/div[1]/label")));
        fayl6.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        fayl7.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        Thread.sleep(1000);
        WebElement qaimeAcilish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-1iji0d4']")));
        actions.scrollToElement(qaimeAcilish).perform();
        qaimeAcilish.click();

        WebElement qabScroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1h:")));
        actions.scrollToElement(qabScroll).perform();


        Thread.sleep(1000);
        WebElement qfNomresi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1d:")));
        qfNomresi.sendKeys("TestQFNomre");

        WebElement qaimTarix = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r1e:")));
        qaimTarix.sendKeys("27.12.2023");

        WebElement neqNovu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-fvipm8'])[4]")));
        neqNovu.click();

        Thread.sleep(1000);
        WebElement neqNovHavaneq = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")));
        neqNovHavaneq.click();

        WebElement mehsuluSayi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1f:")));
        mehsuluSayi.sendKeys("1");

        WebElement qabQeyd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1h:")));
        qabQeyd.sendKeys("Testqablashdirma qeyd");

        Thread.sleep(1000);
        WebElement plusSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-18zaio9']")));
        plusSelect.click();


        WebElement malbarede = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiButtonBase-root MuiAccordionSummary-root MuiAccordionSummary-gutters css-6iwz11']")));

        Thread.sleep(1000);
        malbarede.click();
        WebElement malpar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1o:")));
        actions.scrollToElement(malpar).perform();

        WebElement qfAddNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo-simple-select")));
        qfAddNumber.click();

        WebElement addnumqf = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[3]")));
        addnumqf.click();

        WebElement productCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div/div")));
        productCategory.click();
        WebElement pCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[5]")));
        pCategory.click();

        WebElement xif  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1i:")));
        xif.click();

        String xifInput = "0101 29 900 0 - – – – digərləri";
        WebElement xifInput1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + xifInput + "')]")));
        xifInput1.click();

        WebElement mensheOlkesi  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[4]/div/div/div")));
        mensheOlkesi.click();

        String molke = "Albaniya";
        WebElement molkeSec = driver.findElement(By.xpath("//*[contains(text(), '" + molke + "')]"));
        molkeSec.click();

        WebElement productNameAz = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1m:")));
        productNameAz.sendKeys("Test MalinAdi");

        WebElement productName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1n:")));
        productName.sendKeys("Test product name");

        WebElement productAdress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":r1o:\"]")));

        productAdress.sendKeys("Test product unvan");

        WebElement olcuVahid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[3]/div[1]/div/div")));
        olcuVahid.click();

        WebElement olcuVahidiSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[4]")));
        olcuVahidiSec.click();

        WebElement umumiCheki = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1p:")));
        umumiCheki.sendKeys("2");

        WebElement xalisCheki = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1q:")));
        xalisCheki.sendKeys("2");

        WebElement qablashdirma = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[3]/div[4]/div/div")));
        qablashdirma.click();

        Thread.sleep(1000);
        WebElement qablashdirmaSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[4]")));
        qablashdirmaSec.click();

        WebElement qabNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1r:")));
        qabNum.sendKeys("2");

        WebElement valyuta = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div/div")));
        actions.scrollToElement(valyuta).perform();
        valyuta.click();

        WebElement valyutaSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")));
        valyutaSec.click();

        WebElement valTeyin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1s:")));
        valTeyin.sendKeys("50");

        WebElement yekMebleg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(":r1t:")));
        yekMebleg.sendKeys("100");

        WebElement plusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/div[3]/div[2]/div[2]/div/div/div/div/div[4]/div[4]/div/button/div")));
        plusButton.click();

        WebElement imzaTestiq  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-ltksrw'])[2]")));

        actions.scrollToElement(imzaTestiq).perform();

        Thread.sleep(1000);
        imzaTestiq.click();



    }
}