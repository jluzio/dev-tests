package org.example.java8.method1;

import java.util.function.Supplier;

public class Car {
	private String desc;

	public Car() {
		super();
	}

	public Car(String desc) {
		super();
		this.desc = desc;
	}

	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}

	public static void collide(final Car car) {
		System.out.println("Collided " + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + another.toString());
	}

	public void repair() {
		System.out.println("Repaired " + this.toString());
	}

	@Override
	public String toString() {
		return "Car[" + desc + "]";
	}
	
	
}
