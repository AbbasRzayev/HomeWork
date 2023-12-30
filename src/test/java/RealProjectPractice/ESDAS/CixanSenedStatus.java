package RealProjectPractice.ESDAS;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
public class CixanSenedStatus extends EsdasTestBase {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://test.meis.competition.gov.az/auth");
        WebElement sistemeGirish = driver.findElement(By.xpath("//div[@class='toggle_state ng-tns-c108760427-2 ng-star-inserted']"));
        sistemeGirish.click();
        WebElement istifadeGirish = driver.findElement(By.xpath( "(//span[@class='mat-button-wrapper'])[2]"));
        Thread.sleep(200);
        istifadeGirish.click();
        WebElement login = driver.findElement(By.id("mat-input-0"));
        login.sendKeys("imranovfarid@gmail.com");
        WebElement paswword = driver.findElement(By.id("mat-input-1"));
        paswword.sendKeys("Farid1020");
        WebElement daxilOl = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
        Thread.sleep(200);
        daxilOl.click();
        String firstPage =  driver.getWindowHandle();
        WebElement proqramlarim;
        try {
            proqramlarim = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/div[2]/app-menu-item[3]/div")));
            proqramlarim.click();
        } catch (NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
            // Handle the exception or log an error message
        }
        WebElement esdasDaxil;
        esdasDaxil = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-programs/div/div[4]/app-program-item[8]/div/div[1]/span")));
        Thread.sleep(200);
        esdasDaxil.click();
        Thread.sleep(200);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);

        }
        String url = driver.getCurrentUrl();
        System.out.println("windowHandles = " + url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement yeniSened = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Yeni sənəd']")));
        yeniSened.click();
        WebElement cixanSened = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/span"));
        Thread.sleep(2000);
        clickToTheButton(cixanSened);
        WebElement shexs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mui-104\"]")));
        shexs.sendKeys("KƏRİMLİ ŞƏMSƏDDİN ZAUR");
        String boyukMeslehetci = "Böyük məsləhətçi - KƏRİMLİ ŞƏMSƏDDİN ZAUR";
        WebElement boyukMeslehetci1 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + boyukMeslehetci + "')]")));
        clickToTheButton(boyukMeslehetci1);

        WebElement paySec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[3]")));
        clickToTheButton(paySec);

        WebElement vizaShemseddinSec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Viza üçün']")));
        clickToTheButton(vizaShemseddinSec);

        shexs.sendKeys("MUSASOY CAVİD XANLAR OĞLU");
        String mudur = "Rəis - MUSASOY CAVİD XANLAR OĞLU";
        WebElement mudur1 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + mudur + "')]")));
        clickToTheButton(mudur1);

       // WebElement paySec1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf'])[4]")));
       // clickToTheButton(paySec1);

        //WebElement imzaCavidSec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='İmza üçün']")));
        //clickToTheButton(imzaCavidSec);

        WebElement senedinNovu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-106")));
        clickToTheButton(senedinNovu);

        WebElement senedinNovuSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")));
        clickToTheButton(senedinNovuSec);

        WebElement altSenedinNovu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-109")));
        clickToTheButton(altSenedinNovu);

        WebElement altSenedinNovuSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")));
        clickToTheButton(altSenedinNovuSec);

        WebElement icraNovu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-115")));
        clickToTheButton(icraNovu);

        WebElement icraNovuSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Tam icra']")));
        clickToTheButton(icraNovuSec);

        WebElement gi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-117")));
        clickToTheButton(gi);

        String giText = "Mərkəzi İcra Hakimiyyəti və digər dövlət orqanlarına çıxan sənədlərin qeydiyyatı kitabı- 03";
        WebElement gi2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), '" + giText + "')]")));
        clickToTheButton(gi2);

        WebElement tamAdi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-124")));
        tamAdi.sendKeys("test tam adi");
        WebElement unvan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-125")));
        unvan.sendKeys("test unvan");

        WebElement mw = driver.findElement(By.className("jss23"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", mw);

        WebElement plusButton = wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[2]"))));
        plusButton.click();

        WebElement icraNeticesi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-119")));
        clickToTheButton(icraNeticesi);

        WebElement icraNEtSec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")));
        clickToTheButton(icraNEtSec);

        WebElement movzu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"note\"]")));
        movzu.sendKeys("Test Movzu");

        WebElement mezmun = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/main/div[1]/div/div[2]/div/div[2]/div[7]/div[2]/div/textarea[1]")));
        mezmun.sendKeys("Test Mezmun");

        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/main/div[1]/div/div[2]/div/div[2]/div[8]/div/label/span")));
        clickToTheButton(add);
        Thread.sleep(1000);
        String filePath = "C:\\Users\\User\\Desktop\\TestFiles\\word.docx";
        robotClassDosyaYukleme(filePath);

        WebElement gonder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Göndər']")));
        clickToTheButton(gonder);
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(firstPage);

        WebElement idare = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/mat-nav-list/mat-list-item[9]/span/img")));
        clickToTheButton(idare);

        Thread.sleep(1000);
        WebElement nameAdd = driver.findElement(By.id("mat-input-3"));
        nameAdd.sendKeys("Şəmsəddin");
        WebElement soyadAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-4")));
        soyadAdd.sendKeys("KƏRİMLİ");
        String axtar = "Axtar";
        WebElement axtarActual = driver.findElement(By.xpath("//*[contains(text(), '" + axtar + "')]"));
        clickToTheButton(axtarActual);
        Thread.sleep(1000);
        WebElement nameSurnameActual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-control/div/app-users-tab/div[3]/table/tbody/tr/td[2]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(nameSurnameActual).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(nameSurnameActual).perform();

        WebElement shexsinAdindanGirish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bu şəxsin adından sistemə giriş etmək']")));
        clickToTheButton(shexsinAdindanGirish);

        WebElement proqramlarim1;
        try {
            proqramlarim1 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/div[2]/app-menu-item[3]/div")));
            proqramlarim1.click();
        } catch (NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
            // Handle the exception or log an error message
        }


        esdasDaxil = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-programs/div/div[4]/app-program-item[8]/div/div[1]/span")));
        Thread.sleep(200);
        esdasDaxil.click();
        Thread.sleep(200);
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String windowHandle : windowHandles1) {
            driver.switchTo().window(windowHandle);

        }
        String url1 = driver.getCurrentUrl();
        System.out.println("windowHandles = " + url1);



    }
}