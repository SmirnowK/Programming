package Hwork_Lesson_06.Hwork_04;

public class LiftMethod {

    public int numberOfLifts(int floor, int stepUp, int stepDown) {
        if (stepUp <= stepDown) {
            throw new IllegalArgumentException("The lift will never reach the top floor with these parameters.");
        }

        int currentFloor = 0;
        int lifts = 0;

        while (currentFloor < floor) {
            lifts++;
            currentFloor += stepUp;

            if (currentFloor >= floor) {
                break;
            }

            currentFloor -= stepDown;
        }

        return lifts;
    }
}