package Lesson_04.Robot;

public class Robot {

    String mark;

    public Robot(String mark) {
        this.mark = mark;}

        public void hello(){
            System.out.println("Hello");
            System.out.println("I am robot " + mark);
        }

        public double currencyConvrter(double usdValue, double exchangeRateUSdToEuro){
            double euroValue = usdValue * exchangeRateUSdToEuro;
            return euroValue;
        }


    }


