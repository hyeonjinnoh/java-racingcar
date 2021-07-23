package step3;

import step3.view.InputView;
import step3.view.ResultView;

public class RacingApp {

    public static final int MOVE_BOUNDARY = 4;

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        int carCounts = InputView.inputCountCar();
        int raceTimes = InputView.inputRaceTimes();
        ResultView.startRace(carCounts,raceTimes);
    }
}
