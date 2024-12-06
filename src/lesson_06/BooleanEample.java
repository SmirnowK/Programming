package lesson_06;

public class BooleanEample {
    public static void main(String[] args) {

        boolean result = true;

        int x = 10;
        int y = 20;

        boolean resultCompareInteger = (x > y);

        System.out.println(resultCompareInteger);

        char letter1 = 'A';
        char letter2 = 'Z';

        System.out.println( (int) letter1);
        System.out.println( (int) letter2);

        boolean resultCompareChar = (letter2 > letter1);

        System.out.println(resultCompareChar);

        /*
                > bolwe
                < menwe
                >= bolwe ili rovno
                <= menwe ili rovno
                == rovno
                != ne rovno
         */
    }
}
