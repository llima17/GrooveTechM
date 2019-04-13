package negativeScenarioTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FailSingInTest {

    private static final String URL = "https://www.movida.com.br/";
    private static final String LOGIN_ICON = "//span[@class='icon icon-login mrxs icon-negative']";
    private static final String CPF_INPUT_FIELD = "//form[@id='form-login']//input[@name='cpf']";
    private static final String INPUT_ID_PASSWD = "//input[@id='senha']";
    private static final String BUTTON_ID_LOGIN_BUTTON = "//button[@id='login-button']";

    protected static WebDriver browser;
    protected static WebDriverWait waitWebDriver;

    /**
     * Setup of the variables regarding the webDrver
     */
    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\GrooveTech\\setup\\chromedriver_win32\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        waitWebDriver = new WebDriverWait(browser, 30);
    }

    /**
     * close the browser after the test is finished.
     */
    @AfterClass
    public static void tearDown()
    {
        browser.quit();
    }

    /**
     * This test access the website "https://www.movida.com.br/" and try to sign in the page with an invalid username.
     */
    @Test
    public void testFailSignIn()
    {

        browser.get(URL);

        browser.findElement(By.xpath(LOGIN_ICON)).click();

        WebElement inputCPF = waitWebDriver.until(ExpectedConditions.elementToBeClickable(By.xpath(CPF_INPUT_FIELD)));
        inputCPF.sendKeys("00011100011");

        WebElement inputPass = waitWebDriver.until(ExpectedConditions.elementToBeClickable(By.xpath(INPUT_ID_PASSWD)));
        inputPass.sendKeys("000000");

        browser.findElement(By.xpath(BUTTON_ID_LOGIN_BUTTON)).click();

        String invalidUser = browser.findElement(By.xpath("//p[contains(text(),'Usuário ou senha inválido(s)!')]")).getText();
        System.out.println(invalidUser);

        assertEquals("Usuário ou senha inválido(s)!",invalidUser);

    }

}
