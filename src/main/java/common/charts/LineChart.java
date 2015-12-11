package common.charts;

import com.googlecode.charts4j.*;
import common.parsers.LoadTime;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by matcievskiy on 03.04.2015.
 */
public class LineChart {

    public void example1(List<LoadTime> lst) throws IOException {
        Long l;
        double d;
        List<Double> competition = new ArrayList<Double>();
        List<String> xAxisList = new ArrayList<String>();


     for(LoadTime p:lst)
     {
         xAxisList.add(p.getPage_name());
         l = p.getLoad_time();
         d = l.doubleValue();
         competition.add(d);
         System.out.println(d);

     }
        AxisLabels xAxis = AxisLabelsFactory.newAxisLabels(xAxisList);
        AxisLabels yAxis = AxisLabelsFactory.newAxisLabels("", "0.5", "1.0", "1.5", "3","5","10","15","20","25","30","35","40","45","50");
        double[] comp = new double[competition.size()];
        for(int i=0;i<competition.size();i++){
            comp[i] = competition.get(i)/1000;

        }

        Line line1 = Plots.newLine(Data.newData(comp), Color.newColor("CA3D05"), "Load test");
        line1.setLineStyle(LineStyle.newLineStyle(2, 1, 0));



        // Defining chart.
        com.googlecode.charts4j.LineChart chart = GCharts.newLineChart(line1);
        chart.setSize(1000, 300);
        chart.setGrid(25, 25, 3, 2);

        // Adding axis info to chart.
        chart.addXAxisLabels(xAxis);
        chart.addYAxisLabels(yAxis);
        String url = chart.toURLString();
        System.out.println(url);





    }


}
