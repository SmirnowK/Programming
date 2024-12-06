package string;

public class WorkWithString {
    public static void main(String[] args) {



        String text = " Eto dlja proverki raboty metoda String ";


      char symbol = text.charAt(0);

      System.out.println(symbol);
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(37));

        // System.out.println(text.charAt(38));  - owibka ptomu 4to pri dlinne stroki v 38 simvolov index javjaetsja ot 0 do 37

        String substtringText1 = text.substring(30);
        String substtringText2 = text.substring(0,10);

        System.out.println(text);

        System.out.println(substtringText1);
        System.out.println(substtringText2);

        System.out.println(substtringText2 + " -> " + substtringText1);

        System.out.println("proverka vhozhdenija texta v drugjuj stroku");

        String testString1 = "rabo";

        boolean resultCheckContains = text.contains(testString1);

        System.out.println("Contains result is - " + resultCheckContains);

        System.out.println("Contains word 'Str' result is - " + text.contains("str"));

        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);

        System.out.println("Contains word 'Str' result is - " + textAfterLowerCase);

        System.out.println("==== ubrat probrly s na4ala do konca ======");

        text = text.trim();
        System.out.println(text);

        System.out.println(text.indexOf("metod"));

        System.out.println(text.replaceAll("o","a"));



    }
}
