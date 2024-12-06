package lesson_06.testing;

public class TempTest {
    public static void main(String[] args) {
        TemepConverter temepConverter = new TemepConverter();

        double tempSource = 100;
        double expectedResult = 212;
        double actualResult = temepConverter.converterFromCelsiusToFahrenheit(tempSource);

        if(expectedResult == actualResult) {
            System.out.println("Test #1 passed!");
        }else {
            System.out.println("Test #1 FAILED!!!");
            System.out.println("Expected result" + expectedResult + " , but received " + actualResult);
        }
    }
}
