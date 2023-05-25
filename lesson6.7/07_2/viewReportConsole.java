package OOP_HomeWork_07_2;

import java.util.List;

public class viewReportConsole implements View {
    public void output(List<reportItem> items) {
        System.out.println("Output to console");
        for (reportItem item : items) {
            System.out.format("Console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
