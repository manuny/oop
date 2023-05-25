package OOP_HomeWork_07_2;

import java.util.List;

public class viewReportPrinter implements View  {
    public void output(List<reportItem> items) {
        System.out.println("Output to printer");
        for (reportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
