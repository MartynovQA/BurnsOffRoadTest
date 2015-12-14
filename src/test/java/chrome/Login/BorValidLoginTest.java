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
public class BorValidLoginTest {
    WebDriver driver = null;
    CheckLogin steps = null;

    @Test()
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("BOR elements Valid")
    public void borValidLoginTest() throws InterruptedException {
        steps.goToBor().
                isdisabled().
                clearemail().
                clearepass().
                checkBorElements().
                clickemailb("user@u.com").
                clickpassb("123456").
                clicklogbut().
                checkBorAva().
           //     logOutDash().
                clickOut();
    }




    @BeforeTest
    public void setUp() throws InterruptedException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        steps = new CheckLogin(driver = WebDriverFactory.getDriver(capabilities));
    }
}
