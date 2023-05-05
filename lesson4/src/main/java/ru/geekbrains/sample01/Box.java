package ru.geekbrains.sample01;

import java.util.ArrayList;
import java.util.Collection;

    class Box<T extends Fruit> {

        ArrayList<T> fruits;
        private String name;
        protected Float boxWeight;

        public Box(String name) {
            this.fruits = new ArrayList<>();
            this.name = name;
            this.boxWeight = boxWeight;
            System.out.printf("\n  >>  %s created\n", this.name);
        }

        public  Float getBoxWeight(Box<T> box){
            float boxWeight = box.count() * (box.get(1)).getWeight();
            return boxWeight;
        }


        public String getName() {
            return name;
        }

        public void add(T content) {
            fruits.add(content);
        }

        public int count() {
            return fruits.size();
        }

        public T get(Integer index) {
            return fruits.get(index);
        }

        public boolean remove(T content) {
            return fruits.remove(content);
        }



        public void merge(Box<T> box) {

            for (int i = 0; i < box.count(); i++) {
                this.add(box.get(i));
                box.remove(box.get(i));
            }
            this.add(box.get(0));
            box.remove(box.get(0));

        }
    }
