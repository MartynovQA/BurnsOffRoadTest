package extenedelements.elements.impl;

import common.tools.Randomizer;
import extenedelements.elements.DropDown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by matcievskiy on 16.04.2015.
 */
public class DropDownImpl extends AbstractElement implements DropDown {

    protected DropDownImpl(final WebElement wrappedElement){

        super(wrappedElement);
    }

    @Override
    public void selectValue(String selection){

        Select select = new Select(wrappedElement);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("Option")) {
                option.click();
            }
        }

        select.selectByVisibleText(selection);
    }

    @Override
    public void selectRandomValue(){

        Select select = new Select(wrappedElement);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("Option")) {
                option.click();
            }
        }
        String selection = options.get(Randomizer.randomNumber(options.size())).getText().toString();
        select.selectByVisibleText(selection);

    }
}
