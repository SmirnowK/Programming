package HWorkLesson05;


public class Hwork1 {
    public static void main(String[] args) {

        String text = "I study Basic Java!";


        System.out.println(text.charAt(18));

        System.out.println("Contains word 'Java' result is - " + text.contains("Java"));

        System.out.println(text.replaceAll("a", "o"));

        String textUp = text.toUpperCase();
        System.out.println(textUp);

        String textLow = text.toLowerCase();
        System.out.println(textLow);

        String subsTringText = text.substring(14,18);
        System.out.println(subsTringText);
    }
}

// 1. Задание №1
//   1 Создайте строку через new - I study Basic Java!
//   2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку,
//   которую создали в п.1
//   3 Распечатать последний символ строки. Используем метод String.charAt().
//   4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//   5 Заменить все символы “а” на “о”.
//   6 Преобразуйте строку к верхнему регистру.
//   7 Преобразуйте строку к нижнему регистру.
//   8 Вырезать строку Java c помощью метода String.substring().
