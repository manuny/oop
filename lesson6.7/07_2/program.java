package OOP_HomeWork_07_2;

public class program {
    public static void main(String[] args) {
        report report_1 = new report(new viewReportPrinter());
        report_1.calculate();
        report_1.output();
    }
}
