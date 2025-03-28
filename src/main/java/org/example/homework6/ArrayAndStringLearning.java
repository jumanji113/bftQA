package org.example.homework6;

public class ArrayAndStringLearning {
    public static void main(String[] args) {
        String[] strings ={"привет", "ПОКА", "гипербола"};
        System.out.println(strings[0].toUpperCase());
        System.out.println(strings[1].toLowerCase());
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].indexOf("О") == 1){
                StringBuilder stringBuilder = new StringBuilder(strings[i]);//исправил на i
                System.out.println(stringBuilder.insert(3, " "));
            }
        }
    }
}
