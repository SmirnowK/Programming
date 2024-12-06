package lesson_06.conditionOperator;

import java.util.Scanner;

public class ConditionOperators3 {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please neter 'x' value -> ");
        x = scanner.nextInt();

        // vhodit li 4islo v diapozon ot 0 do 100 ili ot 100 do 200 ili ne v odin iz nih.

        if (x >= 0) {
            if (x <= 100) {
                System.out.println("Diapozon 1");
            } else if (x <= 200) {
                System.out.println("Diapozon 2");
            } else System.out.println("Out of range!");
        } else System.out.println("Out of range! (negative)");


        if (x >= 0 && x <= 100) {
            System.out.println("Diapozon 1");
        } else if (x > 100 && x <= 200) {
            System.out.println("Diapozon 2");
        } else {
            System.out.println("X is out");
        }

        //System.out.println((true&&true)&&(true||false);

        // && - i esli odin false to vsegda false
        // || - ili esli odin false to vsjo ravno vsegda true
        // ! - otricanie
    }
}

