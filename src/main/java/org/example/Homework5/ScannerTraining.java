package org.example.Homework5;

import java.util.Scanner;

public class ScannerTraining {
    public static void main(String[] args) {
        String result = "Ваш результат: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");

        float sum = 0;
        try {
            sum = scanner.nextFloat();
        } catch (Exception e){
            System.out.println("Следующий раз введите тип число, котрое больше 0, в данным момент ошибка + " + e);
            return;
        }

        System.out.println("Введите кол-во месяцев: ");
        int time = 0;
        try {
            time = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Введите корректное кол-во месяцев отличное от 0, в данным момент ошибка + " + e);
            return;
        }

        if(sum <= 0 || time <= 0){
            System.out.println("Вы ввели некорректную сумму или Некорректное кол-во месяцев");
        } else {
            float actualResult = sum;
            for (int i = 1; i <= time; i++) {
                actualResult = actualResult + (actualResult * 0.07f);
            }
            System.out.println(result);
            System.out.println("После " + time + " месяцев сумма вклада составит " + actualResult);
        }

    }

}
