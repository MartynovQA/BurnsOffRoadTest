package extenedelements.elements.impl;

import extenedelements.elements.Link;
import extenedelements.elements.Text;
import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 16.04.2015.
 */
public class TextImpl extends AbstractElement implements Text {

    protected TextImpl(final WebElement wrappedElement) {
        super(wrappedElement);}

    @Override
    public String getText(){

        return wrappedElement.getText();
    }
}
