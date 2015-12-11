package extenedelements.elements;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by matcievskiy on 16.04.2015.
 */
public interface Table extends Element {

    List<WebElement> getTable();
    boolean isDisplays();
}
