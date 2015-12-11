package extendcontainer;

import extenedelements.elements.Element;
import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public interface Container extends Element {
    void init(WebElement wrappedElement);
}