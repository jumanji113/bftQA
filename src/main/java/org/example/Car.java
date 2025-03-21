package org.example;

public class Car {
    int year;
    String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public Car() {
        this.year = -1;
    }

    public Car(String model) {
        this.model = model;
        this.year = -1;
    }

    public void makeBeBe(){
        if(this.year > 1995){
            System.out.println("Машина моложе 1995 года");
        } else if(this.year < 1995 && this.year > 0){
            System.out.println("Машина старше 1995 года");
        } else {
            System.out.println("Возраст машины неизвестен");
        }
    }
}
