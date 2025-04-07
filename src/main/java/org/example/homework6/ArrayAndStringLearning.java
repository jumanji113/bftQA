package org.example.homework6;

import java.util.Random;

public class ArrayAndStringLearning {
    public static void main(String[] args) {
        String[] strings ={"привет", "ПОКА", "гипербола"};
        //System.out.println(strings[0].toUpperCase());
        //System.out.println(strings[1].toLowerCase());//закомментил, чтобы не мешало проверять
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].indexOf("О") == 1){
                StringBuilder stringBuilder = new StringBuilder(strings[i]);//исправил на i
                //System.out.println(stringBuilder.insert(3, " "));
            }
        }

        returnRandomElement(strings);
    }

    static Random random = new Random();
    public static int returNRandom(int i){
        return random.nextInt(i);
    }

    public static void returnRandomElement(String [] strings){
        System.out.println(strings[returNRandom(strings.length)]);
    }
}
