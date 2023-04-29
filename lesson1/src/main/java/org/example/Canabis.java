package org.example;

public class Canabis extends Product {

    private double weight;

    public double getWeight() {
        return weight;
    }

    private String grade;

    public String getGrade() {
        return grade;
    }


    private int priceGramm;

    public int getPriceGramm() {
        return priceGramm;
    }




    public void setPriceGramm(int priceGramm) {
        if (priceGramm > 0) {
            this.priceGramm = priceGramm;
        }
        else {
            System.out.println("Цена некорректна");
        }
    }

    public Canabis(String name, String grade, double weight){
        super(name);
        this.grade = grade;
        this.weight = weight;
        if (grade != "Sativa" && grade != "Gydropone"){
            this.grade = "Sativa";
        }

        if (grade == "Sativa"){
            priceGramm = 23;
        }
        if (grade == "Gydropone"){
            priceGramm = 34;
        }
        super.price = priceGramm * weight;
    }

    public Canabis(String name, int price){

    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("название: %s - сорт: %s - вес: %f грамм - цена: %f денег", name, grade, weight, price);

    }

}
