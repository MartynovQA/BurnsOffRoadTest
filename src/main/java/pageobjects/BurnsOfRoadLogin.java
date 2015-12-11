package pageobjects;

import extendcontainer.AbstractContainer;
import extenedelements.ExtendedFieldDecorator;
import extenedelements.elements.Button;
import extenedelements.elements.Link;
import extenedelements.elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by martynov on 11.12.2015.
 */
public class BurnsOfRoadLogin extends AbstractContainer {
    public BurnsOfRoadLogin(WebDriver driver){
        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//div/form/div/div/input")
    private TextField borEmail;

    @FindBy(xpath = "//div/form/div/input")
    private TextField borPass;

    @FindBy(xpath = "//div/div/form/button")
    private Button logButton;

    @FindBy(xpath = "//div/form/div/div/ul/li/p")
    private Link validator;

    public void checkBorElements(){
        Assert.assertTrue(borEmail.isDisplayed());
        Assert.assertTrue(borPass.isDisplayed());
        Assert.assertTrue(logButton.isDisplayed());
    }

    public void fillEmail(String email){
        borEmail.clearAndType(email);
    }

    public void fillPass(String pass){
        borPass.clearAndType(pass);
    }

    public void clickIn(){
        logButton.click();
    }

    public void validatorCheck(){
        Assert.assertTrue(validator.isDisplayed());
    }

    public void logEnter() {
        logButton.clickEnter();
    }

    public void textFieldEmptyE() {
        if (borEmail.getText().length() == 0) {
        }
        else {
            borEmail.clear();
        }
    }
    public void textFieldEmptyP(){
        if (borPass.getText().length() == 0){
        }
        else {
            borPass.clear();
        }
    }
}
