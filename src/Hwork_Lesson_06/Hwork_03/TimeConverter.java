package Hwork_Lesson_06.Hwork_03;

import java.util.Random;

public class TimeConverter {

    Random r = new Random();
    int timeSecond = r.nextInt(28800) + 1;
    int timeHour = timeSecond / 3600;

}