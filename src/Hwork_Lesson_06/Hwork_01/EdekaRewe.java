package Hwork_Lesson_06.Hwork_01;

//1. Задание №1
//
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
// открыты магазины или нет.
//Реализует логический метод canBuy, возвращающий true
//** Значение этой переменной должно быть true, если хотя бы один магазин открыт,
// иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

public class EdekaRewe {
    public static void main(String[] args) {

        boolean canBuy;
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        if(isEdekaOpen || isReweOpen){
            canBuy = true;
            System.out.println("Я могу купить еду, это " + canBuy);
        } else {
            canBuy = false;
            System.out.println("Idi nahui!!" + canBuy);
        }
    }
}