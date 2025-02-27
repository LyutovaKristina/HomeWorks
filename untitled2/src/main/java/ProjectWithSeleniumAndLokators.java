import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectWithSeleniumAndLokators {
    private WebDriver driver;

    public ProjectWithSeleniumAndLokators(WebDriver driver) {
        this.driver = driver;
    }
     final By buttonOzon = By.xpath("//div[@class='v-portal']");
    final By placeholderSearch = By.xpath("//input[@placeholder='Искать на Ozon']");
    final By buttonSearch = By.xpath("//button[@aria-label='Поиск']");
    final By header = By.id("stickyHeader");
    final By catalog = By.className("b2121-a8 tsBodyControl500Medium");
    final By iconOzon = By.xpath("//img[@src='https://ir.ozone.ru/s3/cms/fb/t7e/wc250/193477470.png']");



}

