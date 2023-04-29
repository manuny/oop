package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Ок", "11", -100);
        System.out.println(product3.displayInfo());

        // product3.setPrice(-50.5);
        // product3.name = "____";
        // product3.price = -50.5;

        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 2);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Molochishe", 4, 3);

        Canabis canabis1 = new Canabis("Green", "Sativa", 1.5);
        Canabis canabis2 = new Canabis("Green", "Gydropone", 1.5);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(canabis1);
        products.add(canabis2);
        products.add(bottleOfMilk2);

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        Canabis canabisRes = machine.getCanabis("Green", "Sativa", 1.5);
        if (canabisRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(canabisRes.displayInfo());

        } else {
            System.out.println("Что-то вы не то пытаетесь купить...");
        }
        BottleOfMilk milkRes = machine.getBottleOfMilk("Molochishe", 4, 3);
        milkRes.setPrice(67);
        if (milkRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(milkRes.displayInfo());

        } else {
            System.out.println("Что-");
        }

    }

}
