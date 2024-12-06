package HWorkBook;

public class Cat {

    String name;

    String breed;

    public void greatings(String message){
        System.out.println(message);
        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
