package chrome.Login;

import base.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import steps.borloginsteps.CheckLogin;

/**
 * Created by martynov on 11.12.2015.
 */
public class BorEmptyLoginTest {
    WebDriver driver = null;
    CheckLogin steps = null;

    @Test()
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("BOR elements empty")
    public void borEmptyLoginTest() throws InterruptedException {
        steps.goToBor().
                isdisabled().
                clearemail().
                clearepass().
                clickemailb("").
                clickpassb("").
                clicklogbut().
                checkvalidator();
    }




    @BeforeTest
    public void setUp() throws InterruptedException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        steps = new CheckLogin(driver = WebDriverFactory.getDriver(capabilities));
    }
}
