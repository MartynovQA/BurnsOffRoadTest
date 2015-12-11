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

    public void checkBorElements(){
        Assert.assertTrue(borEmail.isDisplayed());
        Assert.assertTrue(borPass.isDisplayed());
        Assert.assertTrue(logButton.isDisplayed());
    }

    public void fillEmail(String searchText){
        borEmail.clearAndType(searchText);
    }

    public void fillPass(String searchText){
        borPass.clearAndType(searchText);
    }

    public void clickIn(){
        logButton.click();
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
