package extenedelements.elements.impl;

import extenedelements.elements.Link;
import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public class LinkImpl extends AbstractElement implements Link {

    protected LinkImpl(final WebElement wrappedElement) {
        super(wrappedElement);}

    @Override
    public void click() {
        wrappedElement.click();
    }

    @Override
    public String getText(){

       return wrappedElement.getText();
    }
}
