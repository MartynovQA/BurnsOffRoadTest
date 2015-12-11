package chrome.google;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.RemoteException;


import base.WebDriverFactory;
import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import steps.googlesteps.CheckGoogle;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/**
 * Created by matcievskiy on 10.11.2015.
 */
public class GoogleElemetnsTest {

    WebDriver driver = null;
    CheckGoogle steps = null;

    @Test(testName = "1196")
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("Google elemtns ")
    public void googleElementsTest() throws InterruptedException {

        steps.goToGoogle().
                checkGoogleElements();


    }




    @BeforeTest
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        steps = new CheckGoogle(driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome()));
    }




}
