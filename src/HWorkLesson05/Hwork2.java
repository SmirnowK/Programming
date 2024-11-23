package HWorkLesson05;


//2. Задание №2
//Введите 2 слова, используйте сканер.
//Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
//Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
//Распечатать на консоль.

import java.util.Scanner;

public class Hwork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first meassage: ");
        String firstWord = input.nextLine();
        System.out.println("Your text is: " + firstWord);

        System.out.println("Please enter second meassage: ");
        String secondWord = input.nextLine();
        System.out.println("Your text is: " + secondWord);

        int firstHalfLength = firstWord.length() / 2;
        String firstHalf = firstWord.substring(0,firstHalfLength);

        int secondHalfLength = secondWord.length() / 2;
        if (secondWord.length() % 2 != 0) {
            secondHalfLength += 1;
        }
            String secondHalf = secondWord.substring(secondHalfLength);

        String result = firstHalf + secondHalf;
        System.out.println("Result: " +result);
    }
}
