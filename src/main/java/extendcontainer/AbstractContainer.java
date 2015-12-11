package extendcontainer;

import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public abstract class AbstractContainer implements Container {
    private WebElement wrappedElement;

    @Override
    public final void init(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }}
