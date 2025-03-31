package org.example.homework7;

public class Rectangle implements Shape{
    String name;

    public Rectangle(String name) {
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
