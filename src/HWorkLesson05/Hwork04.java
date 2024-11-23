package HWorkLesson05;


// 4. Задание №4
//   Тема: создание переменной типа String.
//   Напишите программу в которой создайте переменную
//   типа String и присвойте ей в качестве начального значения
//   ваше имя. Выведете на консоль значение этой переменной.
//
//   Тема: Конкатенация строк.
//   Напишите программу в которой создайте переменную
//   типа String и присвойте ей в качестве начального значения
//   ваше имя. Выведете на консоль приветствие типа "Hi YourName".
//
//   Тема: Считывание строк с консоли.
//   Программа должна спрашивать как зовут пользователя,
//   считывать его имя с консоли и выводить приветствие
//   в виде: "Hello UserName!".

import java.util.Scanner;

public class Hwork04 {
    public static void main(String[] args) {

        String name = ("Konstantin");
        System.out.println(name);

        String name1 = ("Konstantin");
        System.out.println("Hi " + name1);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String textMessage = input.nextLine();
        System.out.println("Hello " + textMessage + "!");

    }
}
