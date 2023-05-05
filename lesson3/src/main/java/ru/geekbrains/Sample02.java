package ru.geekbrains;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Олег", "Василий", "Денис", "Пётр", "Борис", "Геннадий", "Евгений", "Глеб",
                "Михаил", "Марк" };
        String[] surnames = new String[] { "Григорьев", "Башмаков", "Шпынёв", "Андреев", "Качков", "Дубинин", "Шустров",
                "Сергеев", "Гаврилов", "Никитин" };

        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(25, 65);

        if (random.nextBoolean()) {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary * index);
        } else {
            return new FreeLancer(names[random.nextInt(10)], surnames[random.nextInt(10)], age, (salary * index) / 100);
        }

    }

    public static void main(String[] args) {

        Worker worker = new Worker("Анатолий", "Шестаков", 45, 80000);
        System.out.println(worker.toString());

        FreeLancer freeLancer = new FreeLancer("Олег", "Зидерер", 30, 150);
        System.out.println(freeLancer.toString());

        Employee[] employees = new Employee[7];

        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\n-------------------------------------------------------------------\n");
        System.out.printf("\n*** Отсортированный массив сотрудников по возрасту***\n\n");

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare( o2.culculatesalary(), o1.culculatesalary());
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare( o1.age, o2.age);
    }
}
abstract class Employee implements Comparable<Employee>{
    protected String name;
    protected String surname;
    protected Double salary;
    protected Integer age;

    public Employee(String name, String surname, Integer age, Double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник %s %s, возраст: %d,  заработная плата %.2f руб.", name, surname, age, salary);
    }

    public abstract Double culculatesalary();


    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.culculatesalary(), culculatesalary());
    }
}

class Worker extends Employee {

    public Worker(String name, String surname, Integer age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public Double culculatesalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Main Staff, рабочий %s %s; возраст: %d, заработная плата (фиксированная) %.2f руб.", name,
                surname, age, salary);
    }
}



class FreeLancer extends Employee {

    public FreeLancer(String name, String surname, Integer age, double salary) {
        super(name, surname, age, salary);

    }

    @Override
    public Double culculatesalary() {
        return salary * 20 * 5;
    }

    @Override
    public String toString() {
        return String.format("Staff, фрилансер %s %s; возраст %d,  заработная плата (почасовая) %.2f руб.", name, surname, age, culculatesalary());
    }
}
