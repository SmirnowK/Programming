package Hwork_Lesson_06.Hwork_04;

//4. Задание №4
//Сломанный лифт
//лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
// Каждый раз он поднимается на N этажей и спускается на M этажей.
//Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх.
// Найдите количество подьемов, которые понадобятся лифту.
//
//        Пример:
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подьем: 50 - 1 = 49
//Второй подьем: 49 + 50 - 1 = 98
//Третий подьем: 98 + 50 - 1 = 147
//Четвертый подьем: 147 + 50 - 1 = 196
//Пятый подьем: выйти за пределы H.
//
//реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

public class Lift {
    public static void main(String[] args) {
        LiftMethod liftMethod = new LiftMethod();

        int H = 200;
        int N = 50;
        int M = 1;

        int result = liftMethod.numberOfLifts(H, N, M);
        System.out.println("Number of lifts: " + result);
    }
}
