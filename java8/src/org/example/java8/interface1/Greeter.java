package org.example.java8.interface1;

public interface Greeter {
	
	default public void execute() {
		System.out.println("exterminate!");
	}
	
	default public void sayHello() {
		System.out.println("hello!");
	}
	
	public void evaluate();

}
