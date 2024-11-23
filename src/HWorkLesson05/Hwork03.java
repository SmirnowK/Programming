package HWorkLesson05;

// 3. Задание №3
//Напишите программу, которая вычисляет, сколько лишних калорий будет,
//если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

public class Hwork03 {
    public static void main(String[] args) {

        int calories = 40;

        int pizza1 = (int) (Math.PI * Math.pow(24,2) / 4);

        int calories1 = (calories * pizza1);

        System.out.println("Square centimeters of pizza which is 24 cm in diameter: " + (pizza1) + "cm² " + ", and there are so many calories in pizza: "+ (calories1) + "kcal");


        int pizza2 = (int) (Math.PI * Math.pow(28,2) / 4);

        int calories2 = (calories * pizza2);

        System.out.println("Square centimeters of pizza which is 28 cm in diameter: " + (pizza2) + "cm² " + ", and there are so many calories in pizza: "+ (calories2) + "kcal");


        System.out.println("This difference in calories will be between a 24 and 28 centimeter pizza: " + (calories2 - calories1));

    }
}
