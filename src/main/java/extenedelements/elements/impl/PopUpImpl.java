package extenedelements.elements.impl;

import extenedelements.elements.Link;
import extenedelements.elements.PopUp;
import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */

public class PopUpImpl extends AbstractElement implements PopUp {

    protected PopUpImpl(final WebElement wrappedElement) {
        super(wrappedElement);}

    @Override
    public boolean isDisplays() {

        return wrappedElement.isDisplayed();
    }
}