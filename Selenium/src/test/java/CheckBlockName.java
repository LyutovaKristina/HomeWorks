import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBlockName {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Укажите путь к вашему драйверу браузера, например, ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/test/java/org/example/ConfProperties.java");
        driver = new ChromeDriver();
    }

    @Test
    public void testBlockIsPresent() {
        // Открытие веб-страницы
        driver.get("https://mts.by"); // Замените на нужный URL

        // Поиск блока по идентификатору
        WebElement block = driver.findElement(By.id("h2"));

        // Проверка, что блок присутствует
        Assert.assertNotNull(block, "Блок не найден на странице!");
    }

    @AfterClass
    public void tearDown() {
        // Закрытие браузера
        if (driver != null) {
            driver.quit();
        }
    }
}
#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2