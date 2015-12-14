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

    @FindBy(xpath = "html/body/div[1]/div/nav/div/div[2]/div/div/div/div[5]/a/div")
    private Button avaButton;

    @FindBy(xpath = "html/body/div[1]/div/nav/div/div[2]/div/div/div/div[5]/ul/li[3]/a")
    private Button logOut;

    public void checkBorAva(){
        Assert.assertTrue(avaButton.isDisplayed());
    }

    public void logOutDash() /*throws InterruptedException */{
       // Thread.sleep(2000);
        avaButton.click();
    }

    public void clickOut(){
        avaButton.click();
        logOut.click();
    }
}
