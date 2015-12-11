package pageobjects;

import extendcontainer.AbstractContainer;
import extenedelements.ExtendedFieldDecorator;
import extenedelements.elements.Button;
import extenedelements.elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by martynov on 11.12.2015.
 */
public class BurnsOfRoadDashBoard extends AbstractContainer {
    public BurnsOfRoadDashBoard(WebDriver driver){
        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//div/div/div/a/div")
    private Button avaButton;

    public void checkBorAva(){
        Assert.assertTrue(avaButton.isDisplayed());
    }
}
