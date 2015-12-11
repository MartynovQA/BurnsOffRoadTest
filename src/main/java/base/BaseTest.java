package base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public class BaseTest {

   
    WebDriver driver = null;
    String base_url = "https://google.ru";

    public BaseTest(WebDriver driver) throws InterruptedException{
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }


  
    public void openGoogle(){

        driver.get(base_url);
    }






}
