package lesson_07.practice;

import java.util.Scanner;

public class SumAllNumber {

    //3. Используйте цикл, чтобы просуммировать все числа,
    // которые ввел пользователь, до первого отрицательного.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean condition = true;

        while (condition){
            System.out.println("Please enter number (Negative number for Exit): ");
            int number = scanner.nextInt();

            if (number >= 0){
                sum = sum + number;
            }else {
                condition = false;
            }
        }
        System.out.println("All sum number is: " + sum);
    }
}
