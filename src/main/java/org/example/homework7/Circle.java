package org.example.homework7;

public class Circle implements Shape{
    String name;

    public Circle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Фигура %s рисуется", name));
    }
}
