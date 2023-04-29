package org.example;
import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public Canabis getCanabis(String name, String grade, double weight){

        for (Product product : products){
            if (product instanceof Canabis){
                if (product.getName() == name && ((Canabis)product).getWeight() == weight &&
                        ((Canabis)product).getGrade() == grade){
                    return (Canabis) product;
                }
            }
        }
        return null;


    }

    public Product.BottleOfMilk getBottleOfMilk(String name, int volume, int fat){

        for (Product product : products){
            if (product instanceof Product.BottleOfMilk){
                if (product.getName() == name && ((Product.BottleOfMilk)product).getVolume() == volume &&
                        ((Product.BottleOfMilk)product).getFat() == fat){
                    return (Product.BottleOfMilk) product;
                }
            }
        }
        return null;


    }




}
