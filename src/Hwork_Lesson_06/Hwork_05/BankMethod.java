package Hwork_Lesson_06.Hwork_05;

public class BankMethod {
    public static int limitOfDay(int sum) {

        int days = 0;

        while (sum > 0) {
            int divisor = getDivisor(sum);
            sum -= divisor;
            days++;

        }
        return days;
    }

    private static int getDivisor(int sum) {
        for (int i = sum / 2; i >= 1; i--) {
            if (sum % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
