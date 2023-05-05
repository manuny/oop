package ru.geekbrains.sample01;

class Orange extends Fruit{
    private  String name;

    public Orange(String name) {
        super(1.5f);
        this.name  =  name;
    }

    @Override
    public String toString() {
        return String.format("Orange %s", name);
    }
}
