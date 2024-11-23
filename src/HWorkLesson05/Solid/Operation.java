package HWorkLesson05.Solid;

import java.util.Scanner;

public class Operation {

    public Double operation(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextDouble();
    }
}
//5. Задание №5
//Реализовать программу, выводящую на экран результаты сложения, 
//вычитания, умножения и деления двух чисел, введенных пользователем.
//Каждая из арифметических операций должна быть реализована как отдельный метод.
//Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.
