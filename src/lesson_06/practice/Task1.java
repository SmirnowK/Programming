package lesson_06.practice;

//Задание 1
//
//получить от пользователя положительное число до 1000
//и указать какое из следующих чисел к нему максимально приближенно:
//10, 100 или 1000

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x;
        int y = 10;
        int z = 100;
        int i = 1000;

        var scanner = new Scanner(System.in);
        System.out.println("Enter number from 0 to 1000: ");
        x = scanner.nextInt();

        double y1 = y/2 + z/2;
        double z1 = z/2 + i/2;

        if (x > 0 && x <= 1000) {
            if (x < y1) {
                System.out.println("This number is closer to: 10" + " Your number: " + x);
            } else if (x < z1) {
                System.out.println("This number is closer to: 100" + " Your number: " + x);
            }else {
                System.out.println("This number is closer to: 1000" + " Your number: " + x);
            }
        }

    }
}