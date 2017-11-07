package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CommonAPI {

    public static WebDriver driver;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/shashankjengathe/IdeaProjects/seleniumAutomationUsingMaven/Generic/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.close();

    }

     //common method for click event by CSS-Selector
    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
   }


    //common method for click event by Xpath-Selector
    public void clickByxpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

        //Method for typing into Input Field
    public void typeByCss(String locator, String Ipkeys){
        driver.findElement(By.cssSelector(locator)).sendKeys(Ipkeys);
    }

        //Method Typing and pressing Enter-key
    public void typeByCssEnter(String locator, String Ipkeys){
        driver.findElement(By.cssSelector(locator)).sendKeys(Ipkeys, Keys.ENTER);

    }

        //Method for Selecting Dropdown Elements
    public void selectDropdown(String locator, String dd_value){
        Select dd_element= new Select(driver.findElement(By.name(locator)));
        dd_element.selectByVisibleText(dd_value);
    }



}

