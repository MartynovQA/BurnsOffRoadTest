package extenedelements.elements.impl;

import extenedelements.elements.TextField;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


class TextFieldImpl extends AbstractElement implements TextField {
    protected TextFieldImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void type(final String text) {
        wrappedElement.sendKeys(text);
    }

    @Override
    public void clear() {
        wrappedElement.clear();
    }

    @Override
    public void clearAndType(final String text) {
        clear();
        type(text);
    }

    @Override
    public String getText(){

        return wrappedElement.getText();
    }

    @Override
    public void sendKeys(){

        wrappedElement.sendKeys(Keys.ENTER);
    }

    @Override
    public void click(){

        wrappedElement.click();
    }
}
