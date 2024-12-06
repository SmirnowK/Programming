package lesson_07.practice;

//1. Подсчитать сумму всех четных чисел от 0 до N
//при том что N вводится пользователем

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Создаем сканер для чтения ввода
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя число N
        System.out.print("Введите число: ");
        int N = scanner.nextInt();

        // Переменная для хранения суммы
        int sumEven = 0;

        // Цикл для суммирования чётных чисел
        for (int i = 0; i <= N; i += 2) {
            sumEven += i;
        }

        // Вывод результата
        System.out.println("Сумма всех четных чисел от 0 до " + N + " равна " + sumEven);

        // Закрываем сканер
        scanner.close();
    }
}