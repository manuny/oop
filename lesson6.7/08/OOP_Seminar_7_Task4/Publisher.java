package OOP_Seminar_7_Task4;

public interface Publisher {
    
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String companyName, String vacancy, Double maxSalary);
}

