package org.example.java8.misc;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		stuff(()->"asd");
	}
	
	public static void stuff(Supplier<String> stringSupplier) {
		System.out.println(stringSupplier.get());
	}
	
}
