package carRacing.level3.model;

import carRacing.level3.model.strategy.MovingStrategy;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

	private List<Car> cars;

	private Cars(List<Car> cars){
		this.cars = cars;
	}

	public static Cars create(List<String>carNames){
		List<Car> cars = carNames.stream()
			.map(Car::new)
			.collect(Collectors.toList());

		return new Cars(cars);
	}

	public void moveCarLocation(MovingStrategy movingStrategy) {
		cars.forEach(car ->
			car.moveLocation(movingStrategy));
	}

	public int maxCarLocation() {
		return cars.stream()
			.mapToInt(Car::carLocation)
			.max()
			.getAsInt();
	}

	public int carLocation(int carNum) {
		return cars.get(carNum).carLocation();
	}

	public String carName(int carNum) {
		return cars.get(carNum).carName();
	}

	public int totalNum() {
		return cars.size();
	}

}

