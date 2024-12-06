package lesson_06.practice;

//Задание 2
//
// даны три числа x, y, z с любыми значениями
// (рандомно или пользователь вводит)
//
//  вывести эти три числа:
//  1) в порядке возрастания;
//  2) в порядке убывания;

public class Task22 {
    public static void main(String[] args) {
        UserInput us = new UserInput();
        NumberUtil util = new NumberUtil();

        System.out.println("Enter First number: ");
        int x = us.userInputInt();
        System.out.println("Enter Second number: ");
        int y = us.userInputInt();
        System.out.println("Enter Third number: ");
        int z = us.userInputInt();

        System.out.println("Original number: " + x + ", " + y + ", " + z);
        System.out.println("Sort ascending: ");
        util.printSortedNumbers(x,y,z, true);
        System.out.println("Sort in descending: ");
        util.printSortedNumbers(x,y,z, false);
    }
}
