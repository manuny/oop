package OOP_HomeWork_07_2;

import java.util.ArrayList;
import java.util.List;

public class report {
    private List<reportItem> items; // Отчетные данные

    View view;
    
    public void setView(View view) {
        this.view = view;
    }

    public report(View view) {
        this.view = view;
    }

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<reportItem>();
        items.add(new reportItem("First", (float)5));
        items.add(new reportItem("Second", (float)6));
    }

    public void output(){
        view.output(items);        
        /* PrintReport printReport = new PrintReport();
        printReport.output(items); */
    }
}
