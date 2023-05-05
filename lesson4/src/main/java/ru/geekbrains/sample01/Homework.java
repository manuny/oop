package ru.geekbrains.sample01;

import java.util.ArrayList;
import javax.swing.text.AbstractDocument.Content;

/**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
 */
public class Homework {

    private static void compareTwo(Box b1, Box b2){

        float a = b1.getBoxWeight(b1);
        float b = b2.getBoxWeight(b2);
        int res = Float.compare(a,b);
        if( res == 0) {
            System.out.println("\n Два ящика имеют одинаковый вес");
        }else{
            System.out.println("\nДва ящика не имеют одинаковый вес");
        }
    }

    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>("Коробка для яблок");
        System.out.println(box1.getName());
        System.out.printf("Содержимое коробки: %d фрукты\n", box1.count());
        box1.add(new Apple("Глостер"));
        box1.add(new Apple("Зеленое"));
        box1.add(new Apple("Красное"));

        System.out.println();
        System.out.println("Коробка содержит: \n");
        for (int i = 0; i < box1.count(); i++) {
            System.out.println(box1.get(i));
        }

        Box<Apple> box2 = new Box<>("Коробка для яблок");
        box2.add(new Apple("Галла"));
        box2.add(new Apple("Лакомка"));
        box2.add(new Apple("Семиринка"));
        System.out.printf("Содержимое коробки: %d", box2.count(), "фрукт", "\n");
        System.out.printf("\nВес яблока: %.2f", (box2.get(2)).getWeight());
        System.out.printf("\nВес коробки %.2f kg", box2.getBoxWeight(box2));
        System.out.printf("\nКоробка содержит сорт яблок:  %s", box2.get(2));

        System.out.println();
        System.out.println("Коробка содержит: \n");
        for (int i = 0; i < box2.count(); i++) {
            System.out.println(box2.get(i));
        }
        // Box of Oranges box3
        Box<Orange> box3 = new Box<>("Коробка для апельсинов");
        System.out.println(box3.getName());
        System.out.printf("Коробка содержит: %d фрукт\n", box3.count());
        box3.add(new Orange("Moroc"));
        box3.add(new Orange("Greece"));
        box3.add(new Orange("Spain"));

        System.out.println();

        for (int i = 0; i < box3.count(); i++) {
            System.out.println(box3.get(i));
        }

        // Box of Oranges box4
        Box<Orange> box4 = new Box<>("Коробка для апельсинов");
        System.out.println(box4.getName());
        box4.add(new Orange("Equador"));
        box4.add(new Orange("Costa-Rica"));
        box4.add(new Orange("Columbia"));
        System.out.printf("Коробка содержит: %d фрукт", box4.count());
        System.out.printf("\nВес апельсина: %.2f", (box4.get(1)).getWeight());
        System.out.printf("\nВес коробки %.2f kg", box4.getBoxWeight(box4));
        System.out.printf("\nКоробка содержит сорт апельсинов:  %s ", box4.get(1));

        System.out.println();

        for (int i = 0; i < box4.count(); i++) {
            System.out.println(box4.get(i));
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.println("\n" + "Переложить фрукты из одной коробки в другую:");
        // Transfer fruit from one box to another
        box3.merge(box4);
        System.out.printf("Теперь одна коробка содержит: %d фрукт\n", box3.count());
        for (int i = 0; i < box3.count(); i++) {
            System.out.println(box3.get(i));
        }
        System.out.println();
        System.out.printf("AВ другой коробке находится: %d фрукт\n", box4.count());
        for (int i = 0; i < box4.count(); i++) {
            System.out.println(box4.get(i));
        }
        // Two box weights compare
        System.out.println("Сравнение веса двух коробок");
        System.out.printf("\nПервая коробка: %s,  масса: %.2f", box1.getName(), box1.getBoxWeight(box1));
        System.out.printf("\nВторая коробка: %s,  масса: %.2f", box2.getName(), box2.getBoxWeight(box2));

        compareTwo(box1, box2);

        System.out.println("\nСравнение веса двух коробок");
        System.out.printf("\nПервая коробка: %s,  масса: %.2f", box1.getName(), box1.getBoxWeight(box1));
        System.out.printf("\nВторая коробка: %s,  масса: %.2f", box3.getName(), box3.getBoxWeight(box3));

        //Compare two boxe
        compareTwo(box1, box3);

    /* int res = box1.getBoxWeight(box1).compareTo(box3.getBoxWeight(box3));
    if( res == 0) {
      System.out.println("\nTwo boxes have equal weights, TRUE");
    }else{
      System.out.println("\nTwo boxes have different weights, FALSE");
    }     */
    }


}

