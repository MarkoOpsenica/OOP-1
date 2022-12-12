package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class NavigationTest {

    static WebDriver driver;

    By destinations = By.cssSelector("input[type='search']");
    By place = By.className("search_hl_name");
    By chkIn = By.className("bui-calendar__date");
    By date1 = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[6]");
    By date2 = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[6]");
    By search = By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]");
    By breakfast = By.xpath("");


    static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    static void typeIn(By locator, String input){

        getElement(locator).sendKeys(input);
    }



    @BeforeMethod

    public void beforeMethodMethod() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        String url = "https://www.booking.com/index.html?aid=7965225";
        driver.get(url);
    }




    @Test()
    public void navigateUser() throws InterruptedException {
        hoverAndCLick(destinations);
        hoverAndCLick(place);
        hoverAndCLick(chkIn);
        hoverAndCLick(date1);
        hoverAndCLick(date2);
        hoverAndCLick(search);
        hoverAndCLick(breakfast);
        //List<WebElement> choseHotel = driver.findElements(By.)
}


    public void hoverAndCLick(By locator) {


        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator))
                .click()
                .perform();


    }


}

