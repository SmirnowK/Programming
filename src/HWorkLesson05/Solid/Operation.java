package HWorkLesson05.Solid;

import java.util.Scanner;

public class Operation {

    public Double operation(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextDouble();
    }
}

