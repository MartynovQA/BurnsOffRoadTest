package extenedelements.elements.impl;

import extendcontainer.AbstractContainer;
import extenedelements.elements.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by matcievskiy on 20.04.2015.
 */
public class DatePickerImpl extends AbstractElement implements DatePicker {

    protected DatePickerImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void setDate(){

        List<WebElement> allRows = wrappedElement.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                cell.getText();
                System.out.println(cell.getText());
            }
        }

    }


}
