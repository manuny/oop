package org.example;

public class BottleOfMilk extends Product {

    private int volume;


    private int fat;

    public int getFat() {
        return fat;
    }

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name,  int volume, int fat){
        super(name);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("брэнд: %s - название: %s - цена: %f - объем: %d", brand, name, price, volume);

    }
}