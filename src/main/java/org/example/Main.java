package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10, "Pushok");
        Cat cat2 = new Cat(10, "Matroskin");
        Cat cat3 = new Cat(10, "Barbos");
        cat1.checkCats();

        Car bmw = new Car(1994, "Bmw 3 seria");
        Car toyota = new Car(2015, "Camry");
        Car auto = new Car("NonameCar");
        bmw.makeBeBe();
        toyota.makeBeBe();
        auto.makeBeBe();
    }
}