package extenedelements.elements.impl;

import extenedelements.elements.Link;
import extenedelements.elements.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by matcievskiy on 16.04.2015.
 */
public class TableImpl extends AbstractElement implements Table {

    protected TableImpl(final WebElement wrappedElement) {
        super(wrappedElement);}

    @Override
    public List<WebElement> getTable(){

        List<WebElement> allRows = wrappedElement.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                cell.getText();
            }
        }

        return allRows;
    }

    @Override
    public boolean isDisplays(){

        return  wrappedElement.isDisplayed();
    }

}
