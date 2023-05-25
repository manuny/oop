package OOP_Seminar_7_Task4;

import java.util.ArrayList;
import java.util.List;

public class jobAgency implements Publisher {
    List <Observer> observers =  new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String nameCompany,String vacancy,  Double salary) {
       for(Observer observer: observers){
            observer.receiveOffer(nameCompany, vacancy,  salary);
       } ;
    }
}
