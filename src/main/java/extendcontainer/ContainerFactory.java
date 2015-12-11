package extendcontainer;

import org.openqa.selenium.WebElement;

/**
 * Created by matcievskiy on 15.04.2015.
 */
public interface ContainerFactory {
    <C extends Container> C create(Class<C> containerClass, WebElement wrappedElement);
}