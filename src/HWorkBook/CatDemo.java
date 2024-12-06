package HWorkBook;

public class CatDemo {

    public static void main(String[] args) {


        Cat cat = new Cat();

        System.out.println(cat);
        cat.name = "Barsik";
        cat.breed = "wot";
        System.out.println(cat);

        cat.greatings("Privet kowka");

    }
}
