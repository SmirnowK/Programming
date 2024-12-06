package string;

public class StringExample {
    public static void main(String[] args) {

        String text1 = "This is string text Example";

        String text2 = "This is string text Example";

        String text3 = new String("This is string text Example");

        System.out.println("==== sravnenie 4erez '==' =======");

        System.out.println(text1 == text2);

        System.out.println(text1 == text3);

        System.out.println("==== sravnenie 4erez equals");

        System.out.println(text1.equals(text2));

        System.out.println(text1.equals(text3));
    }
}
