package org.example.Homework3and4Classes;

public class Cat {
    public int age;
    public String name;
    private static int count;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        count++;
        System.out.println("Новая кошка добавлена");
    }

    public void checkCats(){
        System.out.println("Кошек добавлено " + count);
    }
}
