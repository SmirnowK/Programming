package lesson_07.conditions;

public class ThreeNumbersCompare {

    public int compare(int first, int second, int thrid) {
        int compareResult = 0;

        if ((first >= second) && (first >= thrid)) {
            compareResult = first;
        }
        if ((second >= first) && (second >= thrid)) {
            compareResult = second;
        }
        if ((thrid >= first) && (thrid >= second)) {
            compareResult = thrid;
        }

        return compareResult;
    }

    public int compareTwoNumbers(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    // аналогично записи через тернарный оператор

    public int compareTwoNumbers2(int x, int y) {
        return (x > y) ? x : y;
    }
}
