package org.example;

import org.example.Homework3and4Classes.Car;
import org.example.Homework3and4Classes.Cat;
import org.example.homework14.Box;

import java.util.ArrayList;
import java.util.List;

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

        List<Box> listBox = new ArrayList<>();
        List<Box> listBoxNew = new ArrayList<>();

        Box box1 = new Box(30.4, 22.5, 11.1);
        Box box2 = new Box(50.4, 14.5, 2.2);
        Box box3 = new Box(64.4, 11.5, 11.3);
        Box box4 = new Box(24.4, 6.5, 44.5);

        listBox.add(box1);
        listBox.add(box2);
        listBox.add(box3);
        listBox.add(box4);

        listBox.stream().filter(x-> x.getWidth() > 30).forEach(listBoxNew::add);

        System.out.println(listBox);
        System.out.println(listBoxNew);
    }
}