package Lesson05.publicAndPrivate.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        double random1 = Math.random() * (50 - 10 + 1) +10;
        double random2 = Math.random() * 100;
        double random3 = Math.random() * 100;
        double random4 = Math.random() * 100;
        double random5 = Math.random() * (1000000 - 150000 +1) + 150000;

        // min + random * (max - min +1)

        System.out.println("1st random example: " + Math.round(random1));
        System.out.println("1st random example: " + Math.round(random2));
        System.out.println("1st random example: " + Math.round(random3));
        System.out.println("1st random example: " + Math.round(random4));
        System.out.println("1st random example: " + Math.round(random5));


        System.out.println("=====================");

        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble(100));

    }
}
