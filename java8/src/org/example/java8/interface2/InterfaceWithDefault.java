package org.example.java8.interface2;

public interface InterfaceWithDefault {
	
	default void defaultMethod() {
		System.out.println("default impl");
	}

}
