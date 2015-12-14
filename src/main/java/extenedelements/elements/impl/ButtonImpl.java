package extenedelements.elements.impl;

import extenedelements.elements.Button;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


class ButtonImpl extends AbstractElement implements Button {
    protected ButtonImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }


    public void click() {
        wrappedElement.click();
    }


    public boolean isDisplays(){

      return wrappedElement.isDisplayed();

    }

    public boolean isDisabled() {
        if(wrappedElement.getAttribute("disabled")=="disabled"){
            return true;
        }
        else {
            return false;
        }
    }

    public void clickEnter() {
        wrappedElement.sendKeys(Keys.ENTER);
    }
}
