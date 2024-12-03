package Hwork_Lesson_06.HWork_02;

//2. Задание №2
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные Temperature1 и Temperature2.
//В результате он выводит сообщение true или false.

public class Temp {

    public static void main(String[] args) {

        double temperature1 = 101;
        double temperature2 = 99;

        if(temperature1 > 100 && temperature2 < 100) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
