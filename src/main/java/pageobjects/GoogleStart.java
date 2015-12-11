package pageobjects;

import common.tools.Randomizer;
import extendcontainer.AbstractContainer;
import extenedelements.ExtendedFieldDecorator;
import extenedelements.elements.Button;
import extenedelements.elements.Link;
import extenedelements.elements.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sun.java2d.pipe.BufferedTextPipe;

/**
 * Created by matcievskiy on 14.07.2015.
 */
public class GoogleStart extends AbstractContainer {

    public GoogleStart(WebDriver driver){

        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);

    }

    @FindBy(name = "q")
    private TextField googleSearch;

    @FindBy(name = "btnK")
    private Button searchButton;

    @FindBy(name = "btnG")
    private Button newSearchButton;

    @FindBy(xpath = "//*[@id=\"hplogo\"]")
    private Link googleLogo;

            public void checkThatWeAtGoogle(){


                Assert.assertTrue(googleLogo.isDisplayed());

            }

            public void checkGoogleElemetns(){

                Assert.assertTrue(searchButton.isDisplayed());
                Assert.assertTrue(googleSearch.isDisplayed());
            }

            public void fillSearch(String searchText){

                googleSearch.clearAndType(searchText);

            }


            public void clickSearch(){

                newSearchButton.click();

            }



}
