package OOP_Seminar_7_Task4;

import java.util.Random;

public class company {
    
    private String nameCompany;
    private String vacancy;
    private Double maxSalary; 
    private Publisher jobAgency;
    private Random random;

    

    

    
    public company(String nameCompany, String vacancy,  Double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.vacancy = vacancy;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random =  new Random();
    }

    public void needEmployee() {
        Double salary = random.nextDouble(3000.0, maxSalary);
        jobAgency.sendOffer(nameCompany, vacancy,  salary);
    };


}
