package OOP_Seminar_7_Task4;

public class engineer implements Observer {

    private String name;
    private  Double salary; 

    public engineer(String name) {
        this.name =  name;
        salary  =  75000.0;
    }


    @Override
    public void receiveOffer(String companyName, String vacancy,  Double salary) {
        if (this.salary < salary) {
            System.out.printf("Engineer %s >>> approve this job offer %s -  %.2f, thanks!\n", name, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Salary %.2f in %s is too small for engineer >>> %s , I will find better jobOffer\n", salary, companyName, name);
        };
    }
    
}
