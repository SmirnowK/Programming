package Lesson05.publicAndPrivate.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.model = "F90 M5";
        car.color = "Schwarz";

        System.out.println(car.color);
    }
}
