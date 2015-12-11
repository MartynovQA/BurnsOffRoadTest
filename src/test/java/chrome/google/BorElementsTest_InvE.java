package chrome.google;

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
public class BorElementsTest_InvE {
    WebDriver driver = null;
    CheckLogin steps = null;

    @Test(testName = "3")
    @Severity(value = SeverityLevel.CRITICAL)
    @Features("BOR elements invalid email")
    public void borElementsTestEmpty() throws InterruptedException {
        steps.goToBor().
                clearemail().
                clearepass().
                clickemailb("ololo@mail.com").
                clickpassb("123456").
                clicklogbut();
    }




    @BeforeTest
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        steps = new CheckLogin(driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome()));
    }
}
