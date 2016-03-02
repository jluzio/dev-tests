package org.example.java8.method1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TestRunner {

	public static void main(String[] args) {
		Supplier<Car> carFactory = () -> new Car("car-" + (int)Math.floor(Math.random() * 100));
//		final Car car = Car.create(Car::new);
		final Car car = Car.create(carFactory);
		final List<Car> cars = Arrays.asList(car);
		
		cars.forEach( Car::collide );

		cars.forEach( Car::repair );

		final Car police = Car.create( Car::new );
		cars.forEach( police::follow );

	}

}
