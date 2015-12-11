package common.tools;


import common.charts.LineChart;
import common.parsers.JsonParserPage;
import common.parsers.LoadTime;
import common.parsers.PageForJson;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by matcievskiy on 03.04.2015.
 */
public class PageWatcher {
    static LineChart chart = new LineChart();
    static StopWatch watcher = new StopWatch();




    public static void Check_Performance(WebDriver driver) throws IOException {
        List<LoadTime> perf = new ArrayList<LoadTime>();
        LoadTime l = null;
        for (PageForJson pg : JsonParserPage.pagesFromJson("src/main/resources/pages.json")) {
            l = new LoadTime();
            l.setPage_name(pg.getName());
            watcher.start();
            driver.get(pg.getUrl());
            waitForLoad(driver);
            watcher.stop();
            l.setLoad_time(watcher.getTime());
            perf.add(l);
            watcher.reset();

        }
        chart.example1(perf);
    }

    public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

}
