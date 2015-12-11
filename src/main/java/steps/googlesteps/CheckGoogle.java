package steps.googlesteps;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import pageobjects.GoogleSearchResults;
import pageobjects.GoogleStart;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by matcievskiy on 14.07.2015.
 */
public class CheckGoogle extends BaseTest {

    WebDriver driver = null;
    GoogleStart googleStart = null;
    GoogleSearchResults googleSearchResults = null;

    public CheckGoogle(WebDriver driver) throws InterruptedException{

        super(driver);
        this.driver = driver;

        googleStart = new GoogleStart(driver);
        googleSearchResults = new GoogleSearchResults(driver);
    }


    @Step("Go to google")
    public CheckGoogle goToGoogle()
    {

        super.openGoogle();
        return this;
    }

    @Step("Check google icon")
    public CheckGoogle checkGoogleIcon(){

        googleStart.checkThatWeAtGoogle();
        return this;
    }

   @Step("Check google elements")
    public CheckGoogle checkGoogleElements(){

       googleStart.checkGoogleElemetns();
       return this;
   }

    @Step("Fill search bar")
    public CheckGoogle clkSearchBtn(String text){

        googleStart.fillSearch(text);
        return this;
    }

    @Step("Click searh button")
    public CheckGoogle clickSearch(){

        googleStart.clickSearch();
        return this;
    }

    @Step("Check search results")
    public CheckGoogle checkSearchResult(){

        googleSearchResults.checkSearchResult();
        return this;

    }
}
