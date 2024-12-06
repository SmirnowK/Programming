package lesson_06.practice;

//Задание 2
//
// даны три числа x, y, z с любыми значениями
// (рандомно или пользователь вводит)
//
//  вывести эти три числа:
//  1) в порядке возрастания;
//  2) в порядке убывания;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        var scanner = new Scanner(System.in);
        System.out.println("Enter 3 random numbers: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if (x < y && y < z){
            System.out.println("1 " + x + y + z);
        } else if (y < x && x < z) {
            System.out.println("2 " + y + x +z);
        } else if (x < z && z < y) {
            System.out.println("3 " + x + z + y);
        }else if (z < x && x < y){
            System.out.println("4 " + z + x + y);
        } else if (y < z && z < x) {
            System.out.println("5 " + y + z + x);
        } else if (z < y && y < x) {
            System.out.println("6 " + z + y + x);
        }else {
            System.out.println("Nothing");
        }
    }
}
