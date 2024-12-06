package lesson_07.practice;

import java.util.Scanner;

//2. проверить является ли число которое ввел пользователь - простым
//(делится без остатка только на 1 и на себя)

public class CheckNumber {
    public static void main(String[] args) {
        // Создаем сканер для ввода числа
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя число
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        // Проверяем, является ли число простым
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Числа меньше или равные 1 не являются простыми
        } else {
            // Проверяем делимость числа от 2 до √number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Если число делится на i без остатка, оно не простое
                    break;
                }
            }
        }

        // Вывод результата
        if (isPrime) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }

        // Закрываем сканер
        scanner.close();
    }
}