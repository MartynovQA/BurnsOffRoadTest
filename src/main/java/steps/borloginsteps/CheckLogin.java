package steps.borloginsteps;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import pageobjects.BurnsOfRoadDashBoard;
import pageobjects.BurnsOfRoadLogin;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by martynov on 11.12.2015.
 */
public class CheckLogin extends BaseTest {
    WebDriver driver = null;
    BurnsOfRoadLogin burnsOfRoadLogin = null;
    BurnsOfRoadDashBoard burnsOfRoadAva = null;

    public CheckLogin(WebDriver driver) throws InterruptedException {
        super(driver);
        this.driver = driver;

        burnsOfRoadLogin = new BurnsOfRoadLogin(driver);
        burnsOfRoadAva = new BurnsOfRoadDashBoard(driver);
    }

    @Step("Go to Burns Of Road")
    public CheckLogin goToBor(){
        super.openBOR();
        return this;
    }

    @Step("Check BOR elements")
    public CheckLogin checkBorElements(){
        burnsOfRoadLogin.checkBorElements();
        return this;
    }

    @Step("Check Logined")
    public CheckLogin checkBorAva(){
        burnsOfRoadAva.checkBorAva();
        return this;
    }

    @Step("Go to LogOut")
    public CheckLogin logOutDash() throws InterruptedException {
        burnsOfRoadAva.logOutDash();
        return this;
    }

    @Step("LogOut")
    public CheckLogin clickOut(){
        burnsOfRoadAva.clickOut();
        return this;
    }

    @Step("Fill email field")
    public CheckLogin clickemailb(String text){
        burnsOfRoadLogin.fillEmail(text);
        return this;
    }

    @Step("Check disabled button LogIn")
    public CheckLogin isdisabled(){
        burnsOfRoadLogin.checkLogButDis();
        return this;
    }

    @Step("Fill pass field")
    public CheckLogin clickpassb(String text){
        burnsOfRoadLogin.fillPass(text);
        return this;
    }

    @Step("Click log button")
    public CheckLogin clicklogbut(){
        burnsOfRoadLogin.clickIn();
        return this;
    }

    @Step("Click Enter")
    public CheckLogin clickenter(){
        burnsOfRoadLogin.logEnter();
        return this;
    }

    @Step("Clear Email")
    public CheckLogin clearemail(){
        burnsOfRoadLogin.textFieldEmptyE();
        return this;
    }

    @Step("Clear Pass")
    public CheckLogin clearepass(){
        burnsOfRoadLogin.textFieldEmptyP();
        return this;
    }

    @Step("Error Invalid Date")
    public CheckLogin checkvalidator(){
        burnsOfRoadLogin.validatorCheck();
        return this;
    }
}
