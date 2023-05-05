package ru.geekbrains.sample01;

class Apple extends Fruit{
    private String name;

    public Apple(String name) {
        super(1.0f);
        this.name =  name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Apple %s", name);
    }
}