package OOP_Seminar_7_Task4;

public class master implements Observer{
    private String name;
    private  Double salary; 

    public master(String name) {
        this.name =  name;
        salary  =  60000.0;
    }


    @Override
    public void receiveOffer(String companyName, String vacancy,  Double salary) {
        if (this.salary < salary) {
            System.out.printf("Master %s >>> approve vacancy %s job offer  %s -  %.2f, thanks!\n", name, vacancy, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Salary %.2f as %s for %s doesn't match >>> %s, Let's look for  better job\n", salary,vacancy,companyName, name);
        };
    }

}