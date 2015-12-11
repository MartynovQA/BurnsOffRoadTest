package chrome.google;

import base.WebDriverFactory;
import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import steps.googlesteps.CheckGoogle;


import java.lang.reflect.Method;
import java.net.MalformedURLException;

/**
 * Created by matcievskiy on 10.11.2015.
 */
public class GoogleIconTest {

    WebDriver driver = null;
    CheckGoogle steps = null;

    @Test(testName = "1190")
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("Google icon ")
    public void googleIconTest() throws InterruptedException {

        steps.goToGoogle().
                checkGoogleElements();


    }




    @BeforeTest
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        steps = new CheckGoogle(driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome()));
    }

}
