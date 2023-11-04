package step3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {

    private List<Car> cars;
    private int totalRound;

    public Game() {
        this(InputView.numberOfCars(), InputView.numberOfTry());
    }

    public Game(int numberOfCars, int numberOfTry) {
        this.cars = cars(numberOfCars);
        this.totalRound = numberOfTry;
    }

    private List<Car> cars(int numberOfCars) {
        return IntStream.range(0, numberOfCars)
            .mapToObj(i -> new Car())
            .collect(Collectors.toList());
    }

    public void play() {
        ResultView.printResultInfoMessage();
        playAllRound();
    }

    private void playAllRound() {
        IntStream.range(0, this.totalRound).forEach(round -> playRound());
    }

    private void playRound() {
        moveAllCar();
        ResultView.printRoundResult(this.cars);
    }

    private void moveAllCar() {
        this.cars.stream().forEach(Car::move);
    }

    public List<Car> cars() {
        return this.cars;
    }

}
