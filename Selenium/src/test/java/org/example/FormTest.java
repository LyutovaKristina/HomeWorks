package org.example;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
public class FormTest {
   public WebDriver driver;
   public FormTest(WebDriver driver){
       PageFactory.initElements(driver, this);
       this.driver = driver;
   }
   @FindBy(xpath = "//*[constains(@class, 'pay_wrapper']")

