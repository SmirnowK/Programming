package Lesson_04.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Sony");



        Robot robot2 = new Robot("Dynamic");



        robot1.hello();
        robot2.hello();

        double euroValue = robot1.currencyConvrter(100,0.97);
        System.out.println("Из 100 долларов мы получим " + euroValue + " евро");
    }
}
