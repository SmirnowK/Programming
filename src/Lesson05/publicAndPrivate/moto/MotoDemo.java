package Lesson05.publicAndPrivate.moto;

public class MotoDemo {
    public static void main(String[] args) {
        Moto bmw = new Moto("Silver", "1000RR", "BNW");
        System.out.println(bmw);

        System.out.println("Produser moto: " + bmw.getProducer());
        System.out.println("Model moto: " + bmw.getModel());
        System.out.println("Cvet Moto: " + bmw.getColor());
        bmw.setColor("Gelb");
        System.out.println("Cvet Moto: " + bmw.getColor());
    }
}
