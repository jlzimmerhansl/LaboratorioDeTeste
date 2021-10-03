// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CT02ConsultarLivroTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ts-scel-web.herokuapp.com/login");
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void cT02ConsultarLivro() {

        driver.manage().window().setSize(new Dimension(1440, 804));
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("jose");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.linkText("Livros")).click();
        driver.findElement(By.id("isbn")).click();
        driver.findElement(By.id("isbn")).sendKeys("1234");
        driver.findElement(By.linkText("Lista de Livros")).click();
    }
}
