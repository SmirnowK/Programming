package dz2;

public class Zad2 {
    public static void main(String[] args) {

        Zad calc = new Zad();

        int result = calc.sum(0,1,2,3,4,5,6,7,8,9);

        System.out.println("среднее арифметическое: "+result);

        int drob = calc.sum(0,1,2,3,4,5,6,7,8,9) % 10;

        System.out.println("otbrowennaja drobnaja 4ast`: "+drob);
    }
}
