package lesson_06.conditionOperator;

public class ConditionOperator4 {
    public static void main(String[] args) {

        boolean isRain = false;
        boolean isSun = true;

        if (isSun && !isRain){
            System.out.println("Idem guljat bez zonta");
        } else {
            System.out.println("Sidim doma");
        }
    }
}