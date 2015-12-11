package extenedelements;

import extenedelements.elements.Element;
import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public interface ElementFactory {
    <E extends Element> E create(Class<E> elementClass, WebElement wrappedElement);
}