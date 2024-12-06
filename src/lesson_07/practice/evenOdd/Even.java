package lesson_07.practice.evenOdd;

public class Even {
    public static int even(int x) {

        int isEven = 0;

        for (int i = 0; i <= x; i += 2) {
            if (x % i == 0) {
                isEven++;
            }
        }
        return isEven;
    }
}
