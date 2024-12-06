package lesson_07.conditions;

public class ConditionOperationExample {
    public static void main(String[] args) {
         /*
    Написать программу, которая запрашивает у пользователя
    три целых числа и выводит на консоль наибольшее из них.

    PS: перед решением этой задачи распишите на бумаге
    или в комментариях все возможные варианты (комбинации).

    Нельзя пользоваться классом Math.

     */
        /*
        1) "подключить" необходимые классы
        2) запросить у пользователя три числа
        3) отправить эти три числа на сравнение и получить результат
        4) проинформировать пользователя о результате
        */

            UserInput ui = new UserInput();
            ThreeNumbersCompare numbersCompare = new ThreeNumbersCompare();

            System.out.println("Please enter first number: ");
            int first = ui.userIntegerInput();
            System.out.println("Please enter second number: ");
            int second = ui.userIntegerInput();
            System.out.println("Please enter third number: ");
            int third = ui.userIntegerInput();

            int resultCompare = numbersCompare.compare(first,second,third);

        System.out.println("Version 1. Max number is: " + resultCompare);

        int resultCompare2 = numbersCompare.compareTwoNumbers(first, numbersCompare.compareTwoNumbers(second, third));

        System.out.println("Version 2. Max number is: " + resultCompare2);

        int resultCompare3 = numbersCompare.compareTwoNumbers(first, numbersCompare.compareTwoNumbers2(second, third));

        System.out.println("Version 3. Max number is: " + resultCompare3);

    }
}
