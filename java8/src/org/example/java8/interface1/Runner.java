package org.example.java8.interface1;

public interface Runner {
	
	default public void execute() {
		System.out.println("Run Forest, run!");
	}
	
	default public void legIt() {
		System.out.println("GTFO!");
	}
	
	public void evaluate();

}
