import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectWithSeleniumAndLokatorsTest {

    private WebDriver driver;
    private ProjectWithSeleniumAndLokators ozonPage;

    @Before
    public void setUp() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lyuto\\IdeaProjects\\HomeWorks\\untitled2\\target\\chromedriver.exe");

        // Инициализация WebDriver
        driver = new ChromeDriver();

        // Максимизация окна браузера
        driver.manage().window().maximize();

        // Открытие главной страницы Ozon
        driver.get("https://www.ozon.ru");

        // Инициализация класса с локаторами
        ozonPage = new ProjectWithSeleniumAndLokators(driver);
    }

    @Test
    public void testOzonButtonIsDisplayed() {
        // Проверяем, что кнопка Ozon отображается на странице
        boolean isButtonOzonDisplayed = driver.findElement(ozonPage.buttonOzon).isDisplayed();
        if (!isButtonOzonDisplayed) {
            throw new AssertionError("Кнопка Ozon не отображается");
        }
    }

    @Test
    public void testSearchPlaceholderIsPresent() {
        // Проверяем, что поле поиска с плейсхолдером "Искать на Ozon" присутствует
        boolean isSearchFieldPresent = driver.findElement(ozonPage.placeholderSearch).isDisplayed();
        if (!isSearchFieldPresent) {
            throw new AssertionError("Поле поиска не найдено");
        }
    }

    @Test
    public void testSearchFunctionality() {
        // Ввод текста в поле поиска
        driver.findElement(ozonPage.placeholderSearch).sendKeys("Телефон");

        // Нажатие кнопки поиска
        driver.findElement(ozonPage.buttonSearch).click();

        // Проверяем, что результаты поиска загрузились (например, проверяем наличие заголовка)
        try {
            Thread.sleep(3000); // Даем время для загрузки результатов
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean isHeaderDisplayed = driver.findElement(ozonPage.header).isDisplayed();
        if (!isHeaderDisplayed) {
            throw new AssertionError("Результаты поиска не загрузились");
        }
    }

    @Test
    public void testCatalogButtonIsDisplayed() {
        // Проверяем, что кнопка каталога отображается
        boolean isCatalogDisplayed = driver.findElement(ozonPage.catalog).isDisplayed();
        if (!isCatalogDisplayed) {
            throw new AssertionError("Кнопка каталога не отображается");
        }
    }

    @Test
    public void testOzonIconIsDisplayed() {
        // Проверяем, что логотип Ozon отображается
        boolean isIconDisplayed = driver.findElement(ozonPage.iconOzon).isDisplayed();
        if (!isIconDisplayed) {
            throw new AssertionError("Логотип Ozon не отображается");
        }
    }

    @After
    public void tearDown() {
        // Закрытие браузера после выполнения всех тестов
        if (driver != null) {
            driver.quit();
        }
    }
}