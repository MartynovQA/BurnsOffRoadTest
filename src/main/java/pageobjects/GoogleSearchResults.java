package pageobjects;

import extendcontainer.AbstractContainer;
import extenedelements.ExtendedFieldDecorator;
import extenedelements.elements.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

/**
 * Created by matcievskiy on 10.11.2015.
 */
public class GoogleSearchResults extends AbstractContainer{

    public GoogleSearchResults(WebDriver driver){

        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);

    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/h3/a")
    private Link searchResult;


    public void checkSearchResult(){


        Assert.assertTrue(searchResult.getText().toLowerCase().contains("magora systems"));
    }
}
